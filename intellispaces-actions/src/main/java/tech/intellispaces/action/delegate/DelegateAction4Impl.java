package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction4;
import tech.intellispaces.action.broker.BrokerAction4;

class DelegateAction4Impl<R, D1, D2, D3, D4>
  extends AbstractAction4<R, D1, D2, D3, D4>
  implements DelegateAction4<R, D1, D2, D3, D4>
{
  private final BrokerAction4<R, D1, D2, D3, D4> broker;

  DelegateAction4Impl(BrokerAction4<R, D1, D2, D3, D4> broker) {
    this.broker = broker;
  }

  public BrokerAction4<R, D1, D2, D3, D4> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return broker.map(data1, data2, data3, data4).execute(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    return broker.map(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    return broker.map(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    return broker.execute(data1, data2, data3, data4).executeReturnDouble(data1, data2, data3, data4);
  }
}
