package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction3;
import tech.intellispaces.action.Action3;
import tech.intellispaces.action.supplier.SupplierAction;

public class Delegate3<R, D1, D2, D3> extends AbstractAction3<R, D1, D2, D3> {
  private final SupplierAction<Action3<R, D1, D2, D3>> broker;

  public Delegate3(SupplierAction<Action3<R, D1, D2, D3>> broker) {
    this.broker = broker;
  }

  public SupplierAction<Action3<R, D1, D2, D3>> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return broker.get().execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return broker.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    return broker.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    return broker.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3) {
    return broker.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3) {
    return broker.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3) {
    return broker.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return broker.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    return broker.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return broker.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3) {
    return broker.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3) {
    return broker.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3) {
    return broker.get().executeReturnDouble(data1, data2, data3);
  }
}
