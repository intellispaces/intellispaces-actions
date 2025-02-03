package tech.intellispaces.commons.action.broker;

import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.mapper.AbstractMapperAction5;

public class BrokerAction5BasedOnContractor<R, D1, D2, D3, D4, D5>
    extends AbstractMapperAction5<Action5<R, D1, D2, D3, D4, D5>, D1, D2, D3, D4, D5>
    implements BrokerAction5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> contractor;

  BrokerAction5BasedOnContractor(Action5<R, D1, D2, D3, D4, D5> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> map(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return contractor;
  }

  @Override
  public int mapToInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns the action type");
  }

  @Override
  public double mapToDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns th action type");
  }
}
