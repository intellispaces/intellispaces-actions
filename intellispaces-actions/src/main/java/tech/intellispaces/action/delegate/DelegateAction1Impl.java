package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction1;
import tech.intellispaces.action.broker.BrokerAction1;

class DelegateAction1Impl<R, D>
    extends AbstractAction1<R, D>
    implements DelegateAction1<R, D>
{
  private final BrokerAction1<R, D> broker;

  DelegateAction1Impl(BrokerAction1<R, D> broker) {
    this.broker = broker;
  }

  public BrokerAction1<R, D> broker() {
    return broker;
  }

  @Override
  public R execute(D data) {
    return broker.map(data).execute(data);
  }

  @Override
  public int executeReturnInt(D data) {
    return broker.map(data).executeReturnInt(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return broker.map(data).executeReturnDouble(data);
  }
}
