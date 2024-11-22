package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction5;
import tech.intellispaces.action.broker.BrokerAction5;

class DelegateAction5Impl<R, D1, D2, D3, D4, D5>
  extends AbstractAction5<R, D1, D2, D3, D4, D5>
  implements DelegateAction5<R, D1, D2, D3, D4, D5>
{
  private final BrokerAction5<R, D1, D2, D3, D4, D5> broker;

  DelegateAction5Impl(BrokerAction5<R, D1, D2, D3, D4, D5> broker) {
    this.broker = broker;
  }

  public BrokerAction5<R, D1, D2, D3, D4, D5> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return broker.map(data1, data2, data3, data4, data5).execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return broker.map(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return broker.map(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    return broker.execute(data1, data2, data3, data4, data5).executeReturnDouble(data1, data2, data3, data4, data5);
  }
}
