package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction1;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.supplier.SupplierAction;

public class Delegate1<R, D> extends AbstractAction1<R, D> {
  private final SupplierAction<Action1<R, D>> broker;

  public Delegate1(SupplierAction<Action1<R, D>> broker) {
    this.broker = broker;
  }

  public SupplierAction<Action1<R, D>> broker() {
    return broker;
  }

  @Override
  public R execute(D data) {
    return broker.get().execute(data);
  }

  @Override
  public int executeReturnInt(D data) {
    return broker.get().executeReturnInt(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return broker.get().executeReturnDouble(data);
  }
}
