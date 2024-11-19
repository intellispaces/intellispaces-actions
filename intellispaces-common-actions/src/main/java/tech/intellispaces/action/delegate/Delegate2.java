package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.action.Action2;
import tech.intellispaces.action.supplier.SupplierAction;

public class Delegate2<R, D1, D2> extends AbstractAction2<R, D1, D2> {
  private final SupplierAction<Action2<R, D1, D2>> broker;

  public Delegate2(SupplierAction<Action2<R, D1, D2>> broker) {
    this.broker = broker;
  }

  public SupplierAction<Action2<R, D1, D2>> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2) {
    return broker.get().execute(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return broker.get().executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2) {
    return broker.get().executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2) {
    return broker.get().executeReturnInt(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return broker.get().executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2) {
    return broker.get().executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2) {
    return broker.get().executeReturnDouble(data1, data2);
  }
}
