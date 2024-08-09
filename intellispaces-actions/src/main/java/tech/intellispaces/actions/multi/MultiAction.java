package tech.intellispaces.actions.multi;

import tech.intellispaces.actions.AbstractAction5;
import tech.intellispaces.actions.Action5;

import java.util.ArrayList;
import java.util.List;

class MultiAction<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Action5<R, D1, D2, D3, D4, D5>
{
  private final List<Action5<R, D1, D2, D3, D4, D5>> actions;

  MultiAction(Action5<R, D1, D2, D3, D4, D5> action1, Action5<R, D1, D2, D3, D4, D5> action2) {
    this.actions = new ArrayList<>();
    this.actions.addAll(getActions(action1));
    this.actions.addAll(getActions(action2));
  }

  private List<Action5<R, D1, D2, D3, D4, D5>> actions() {
    return actions;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    R result = null;
    for (Action5<R, D1, D2, D3, D4, D5> action : actions) {
      result = action.execute(data1, data2, data3, data4, data5);
    }
    return result;
  }

  private List<Action5<R, D1, D2, D3, D4, D5>> getActions(Action5<R, D1, D2, D3, D4, D5> action) {
    if (action instanceof MultiAction) {
      return ((MultiAction<R, D1, D2, D3, D4, D5>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
