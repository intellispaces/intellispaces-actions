package tech.intellispaces.action.delegate;

import tech.intellispaces.action.AbstractAction0;
import tech.intellispaces.action.broker.BrokerAction0;

class DelegateAction0Impl<R>
    extends AbstractAction0<R>
    implements DelegateAction0<R>
{
  private final BrokerAction0<R> broker;

  DelegateAction0Impl(BrokerAction0<R> broker) {
    this.broker = broker;
  }

  public BrokerAction0<R> broker() {
    return broker;
  }

  @Override
  public R execute() {
    return broker.get().execute();
  }

  @Override
  public int executeReturnInt() {
    return broker.get().executeReturnInt();
  }

  @Override
  public double executeReturnDouble() {
    return broker.get().executeReturnDouble();
  }
}
