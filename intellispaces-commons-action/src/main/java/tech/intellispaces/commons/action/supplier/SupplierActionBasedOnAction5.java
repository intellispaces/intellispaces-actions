package tech.intellispaces.commons.action.supplier;

import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

class SupplierActionBasedOnAction5<R> extends AbstractSupplierAction<R> implements WrapperAction0<R> {
  private final Action5<R, Void, Void, Void, Void, Void> wrappedAction;

  SupplierActionBasedOnAction5(Action5<R, Void, Void, Void, Void, Void> action) {
    this.wrappedAction = action;
  }

  @Override
  public R get() {
    return wrappedAction.execute(null, null, null, null, null);
  }

  @Override
  public int getInt() {
    return wrappedAction.executeReturnInt(null, null, null, null, null);
  }

  @Override
  public double getDouble() {
    return wrappedAction.executeReturnDouble(null, null, null, null, null);
  }

  @Override
  public Action5<R, Void, Void, Void, Void, Void> wrappedAction() {
    return wrappedAction;
  }
}
