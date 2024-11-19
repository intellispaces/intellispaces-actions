package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction5;
import tech.intellispaces.action.Action5;
import tech.intellispaces.action.supplier.SupplierAction;

public class Delegate5<R, D1, D2, D3, D4, D5> extends AbstractAction5<R, D1, D2, D3, D4, D5> {
  private final SupplierAction<Action5<R, D1, D2, D3, D4, D5>> broker;

  public Delegate5(SupplierAction<Action5<R, D1, D2, D3, D4, D5>> broker) {
    this.broker = broker;
  }

  public SupplierAction<Action5<R, D1, D2, D3, D4, D5>> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return broker.get().execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    return broker.get().executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    return broker.get().executeReturnDouble(data1, data2, data3, data4, data5);
  }
}
