package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction0;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.supplier.SupplierAction;

public class Delegate0<R> extends AbstractAction0<R> {
  private final SupplierAction<Action0<R>> broker;

  public Delegate0(SupplierAction<Action0<R>> broker) {
    this.broker = broker;
  }

  public SupplierAction<Action0<R>> broker() {
    return broker;
  }

  @Override
  public R execute() {
    return broker.get().execute();
  }

  @Override
  public int executeReturnInt() {
    return broker.get().executeReturnInt();
  }

  @Override
  public double executeReturnDouble() {
    return broker.get().executeReturnDouble();
  }
}
