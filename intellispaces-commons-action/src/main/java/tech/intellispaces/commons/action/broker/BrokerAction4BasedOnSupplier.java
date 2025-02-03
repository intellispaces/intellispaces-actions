package tech.intellispaces.commons.action.broker;

import tech.intellispaces.commons.action.Action4;
import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.mapper.AbstractMapperAction4;

import java.util.function.Supplier;

public class BrokerAction4BasedOnSupplier<R, D1, D2, D3, D4>
    extends AbstractMapperAction4<Action4<R, D1, D2, D3, D4>, D1, D2, D3, D4>
    implements BrokerAction4<R, D1, D2, D3, D4>
{
  private final Supplier<Action4<R, D1, D2, D3, D4>> contractor;

  BrokerAction4BasedOnSupplier(Supplier<Action4<R, D1, D2, D3, D4>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action4<R, D1, D2, D3, D4> map(D1 data1, D2 data2, D3 data3, D4 data4) {
    return contractor.get();
  }

  @Override
  public int mapToInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns the action type");
  }

  @Override
  public double mapToDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns th action type");
  }
}
