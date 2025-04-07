package tech.intellispaces.actions.broker;

import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.exception.IrregularActionTypeExceptions;
import tech.intellispaces.actions.mapper.AbstractMapperAction2;

public class BrokerAction2BasedOnContractor<R, D1, D2>
    extends AbstractMapperAction2<Action2<R, D1, D2>, D1, D2>
    implements BrokerAction2<R, D1, D2>
{
  private final Action2<R, D1, D2> contractor;

  BrokerAction2BasedOnContractor(Action2<R, D1, D2> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action2<R, D1, D2> map(D1 data1, D2 data2) {
    return contractor;
  }

  @Override
  public int mapToInt(D1 data1, D2 data2) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns the action type");
  }

  @Override
  public double mapToDouble(D1 data1, D2 data2) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns th action type");
  }
}
