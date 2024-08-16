package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.Wrapper0;

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
