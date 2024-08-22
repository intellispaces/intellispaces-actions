package intellispaces.actions.getter;

import intellispaces.actions.Action5;
import intellispaces.actions.wrapper.Wrapper5;

class GetterBasedOnAction5<R> extends AbstractGetter<R> implements Wrapper5<R, Void, Void, Void, Void, Void> {
  private final Action5<R, Void, Void, Void, Void, Void> wrappedAction;

  GetterBasedOnAction5(Action5<R, Void, Void, Void, Void, Void> action) {
    this.wrappedAction = action;
  }

  @Override
  public R get() {
    return wrappedAction.execute(null, null, null, null, null);
  }

  @Override
  public Action5<R, Void, Void, Void, Void, Void> wrappedAction() {
    return wrappedAction;
  }
}
