package tech.intellispaces.actions.broker;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.exception.IrregularActionTypeExceptions;
import tech.intellispaces.actions.mapper.AbstractMapperAction3;

public class BrokerAction3BasedOnContractor<R, D1, D2, D3>
    extends AbstractMapperAction3<Action3<R, D1, D2, D3>, D1, D2, D3>
    implements BrokerAction3<R, D1, D2, D3>
{
  private final Action3<R, D1, D2, D3> contractor;

  BrokerAction3BasedOnContractor(Action3<R, D1, D2, D3> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action3<R, D1, D2, D3> map(D1 data1, D2 data2, D3 data3) {
    return contractor;
  }

  @Override
  public int mapToInt(D1 data1, D2 data2, D3 data3) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns the action type");
  }

  @Override
  public double mapToDouble(D1 data1, D2 data2, D3 data3) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns th action type");
  }
}
