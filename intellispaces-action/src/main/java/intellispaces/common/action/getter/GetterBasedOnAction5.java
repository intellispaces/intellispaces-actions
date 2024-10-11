package intellispaces.common.action.getter;

import intellispaces.common.action.Action5;
import intellispaces.common.action.wrapper.Wrapper5;

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
  public long getAsLong() {
    return wrappedAction.executeReturnLong(null, null, null, null, null);
  }

  @Override
  public double getAsDouble() {
    return wrappedAction.executeReturnDouble(null, null, null, null, null);
  }

  @Override
  public Action5<R, Void, Void, Void, Void, Void> wrappedAction() {
    return wrappedAction;
  }
}
