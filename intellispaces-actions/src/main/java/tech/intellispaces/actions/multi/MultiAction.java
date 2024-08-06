package tech.intellispaces.actions.multi;

import tech.intellispaces.actions.Action5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class MultiAction<V, D1, D2, D3, D4, D5> implements Action5<V, D1, D2, D3, D4, D5> {
  private final List<Action5<V, D1, D2, D3, D4, D5>> actions;

  MultiAction(Action5<V, D1, D2, D3, D4, D5> action1, Action5<V, D1, D2, D3, D4, D5> action2) {
    this.actions = new ArrayList<>();
    this.actions.addAll(getActions(action1));
    this.actions.addAll(getActions(action2));
  }

  private List<Action5<V, D1, D2, D3, D4, D5>> actions() {
    return actions;
  }

  @Override
  public V execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    V result = null;
    for (Action5<V, D1, D2, D3, D4, D5> action : actions) {
      result = action.execute(data1, data2, data3, data4, data5);
    }
    return result;
  }

  private List<Action5<V, D1, D2, D3, D4, D5>> getActions(Action5<V, D1, D2, D3, D4, D5> action) {
    if (action instanceof MultiAction) {
      return ((MultiAction<V, D1, D2, D3, D4, D5>) action).actions();
    } else {
      return List.of(action);
    }
  }

  @Override
  public <A extends Action5<_V, _D1, _D2, _D3, _D4, _D5>, _V, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<V, D1, D2, D3, D4, D5>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
