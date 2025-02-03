package tech.intellispaces.commons.action.supplier;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

class SupplierActionBasedOnAction0<R> extends AbstractSupplierAction<R> implements WrapperAction0<R> {
  private final Action0<R> wrappedAction;

  SupplierActionBasedOnAction0(Action0<R> action) {
    this.wrappedAction = action;
  }

  @Override
  public R get() {
    return wrappedAction.execute();
  }

  @Override
  public int getInt() {
    return wrappedAction.executeReturnInt();
  }

  @Override
  public double getDouble() {
    return wrappedAction.executeReturnDouble();
  }

  @Override
  public Action0<R> wrappedAction() {
    return wrappedAction;
  }
}
