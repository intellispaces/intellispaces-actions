package intellispaces.common.action.getter;

import intellispaces.common.action.wrapper.Wrapper0;
import intellispaces.common.action.Action0;

class GetterBasedOnAction0<R> extends AbstractGetter<R> implements Wrapper0<R> {
  private final Action0<R> wrappedAction;

  GetterBasedOnAction0(Action0<R> action) {
    this.wrappedAction = action;
  }

  @Override
  public R get() {
    return wrappedAction.execute(null, null, null, null, null);
  }

  @Override
  public Action0<R> wrappedAction() {
    return wrappedAction;
  }
}
