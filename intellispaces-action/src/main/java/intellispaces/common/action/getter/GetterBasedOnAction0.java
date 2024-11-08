package intellispaces.common.action.getter;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.WrapperAction0;

class GetterBasedOnAction0<R> extends AbstractGetter<R> implements WrapperAction0<R> {
  private final Action0<R> wrappedAction;

  GetterBasedOnAction0(Action0<R> action) {
    this.wrappedAction = action;
  }

  @Override
  public R get() {
    return wrappedAction.execute();
  }

  @Override
  public int getAsInt() {
    return wrappedAction.executeReturnInt();
  }

  @Override
  public double getAsDouble() {
    return wrappedAction.executeReturnDouble();
  }

  @Override
  public Action0<R> wrappedAction() {
    return wrappedAction;
  }
}
