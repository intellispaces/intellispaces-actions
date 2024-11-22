package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction3;
import tech.intellispaces.action.broker.BrokerAction3;

class DelegateAction3Impl<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements DelegateAction3<R, D1, D2, D3>
{
  private final BrokerAction3<R, D1, D2, D3> broker;

  DelegateAction3Impl(BrokerAction3<R, D1, D2, D3> broker) {
    this.broker = broker;
  }

  public BrokerAction3<R, D1, D2, D3> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return broker.map(data1, data2, data3).execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return broker.map(data1, data2, data3).executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    return broker.execute(data1, data2, data3).executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    return broker.execute(data1, data2, data3).executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3) {
    return broker.execute(data1, data2, data3).executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3) {
    return broker.execute(data1, data2, data3).executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3) {
    return broker.execute(data1, data2, data3).executeReturnInt(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return broker.map(data1, data2, data3).executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    return broker.execute(data1, data2, data3).executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return broker.execute(data1, data2, data3).executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3) {
    return broker.execute(data1, data2, data3).executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3) {
    return broker.execute(data1, data2, data3).executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3) {
    return broker.execute(data1, data2, data3).executeReturnDouble(data1, data2, data3);
  }
}
