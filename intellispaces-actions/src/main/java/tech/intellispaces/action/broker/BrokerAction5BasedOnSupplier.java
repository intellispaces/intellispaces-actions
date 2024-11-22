package tech.intellispaces.action.broker;

import tech.intellispaces.action.Action5;
import tech.intellispaces.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.action.mapper.AbstractMapperAction5;

import java.util.function.Supplier;

public class BrokerAction5BasedOnSupplier<R, D1, D2, D3, D4, D5>
    extends AbstractMapperAction5<Action5<R, D1, D2, D3, D4, D5>, D1, D2, D3, D4, D5>
    implements BrokerAction5<R, D1, D2, D3, D4, D5>
{
  private final Supplier<Action5<R, D1, D2, D3, D4, D5>> contractor;

  BrokerAction5BasedOnSupplier(Supplier<Action5<R, D1, D2, D3, D4, D5>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> map(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return contractor.get();
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
