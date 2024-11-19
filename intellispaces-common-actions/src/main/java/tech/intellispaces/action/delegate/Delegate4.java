package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction4;
import tech.intellispaces.action.Action4;
import tech.intellispaces.action.supplier.SupplierAction;

public class Delegate4<R, D1, D2, D3, D4> extends AbstractAction4<R, D1, D2, D3, D4> {
  private final SupplierAction<Action4<R, D1, D2, D3, D4>> broker;

  public Delegate4(SupplierAction<Action4<R, D1, D2, D3, D4>> broker) {
    this.broker = broker;
  }

  public SupplierAction<Action4<R, D1, D2, D3, D4>> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return broker.get().execute(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    return broker.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4);
  }
}
