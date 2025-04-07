package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.AbstractAction2;
import tech.intellispaces.actions.broker.BrokerAction2;

public class DelegateAction2Impl<R, D1, D2>
    extends AbstractAction2<R, D1, D2>
    implements DelegateAction2<R, D1, D2>
{
  private final BrokerAction2<R, D1, D2> broker;

  public DelegateAction2Impl(BrokerAction2<R, D1, D2> broker) {
    this.broker = broker;
  }

  public BrokerAction2<R, D1, D2> broker() {
    return broker;
  }

  @Override
  public R execute(D1 data1, D2 data2) {
    return broker.map(data1, data2).execute(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return broker.map(data1, data2).executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2) {
    return broker.execute(data1, data2).executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2) {
    return broker.execute(data1, data2).executeReturnInt(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return broker.map(data1, data2).executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2) {
    return broker.execute(data1, data2).executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2) {
    return broker.execute(data1, data2).executeReturnDouble(data1, data2);
  }
}
