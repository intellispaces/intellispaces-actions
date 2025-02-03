package tech.intellispaces.commons.action.broker;

import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.mapper.AbstractMapperAction2;

import java.util.function.Supplier;

public class BrokerAction2BasedOnSupplier<R, D1, D2>
    extends AbstractMapperAction2<Action2<R, D1, D2>, D1, D2>
    implements BrokerAction2<R, D1, D2>
{
  private final Supplier<Action2<R, D1, D2>> contractor;

  BrokerAction2BasedOnSupplier(Supplier<Action2<R, D1, D2>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action2<R, D1, D2> map(D1 data1, D2 data2) {
    return contractor.get();
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
