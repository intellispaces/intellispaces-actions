package tech.intellispaces.actions.broker;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.exception.IrregularActionTypeExceptions;
import tech.intellispaces.actions.mapper.AbstractMapperAction1;

import java.util.function.Supplier;

public class BrokerAction1BasedOnSupplier<R, D>
    extends AbstractMapperAction1<Action1<R, D>, D>
    implements BrokerAction1<R, D>
{
  private final Supplier<Action1<R, D>> contractor;

  BrokerAction1BasedOnSupplier(Supplier<Action1<R, D>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action1<R, D> map(D data) {
    return contractor.get();
  }

  @Override
  public int mapToInt(D data) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns the action type");
  }

  @Override
  public double mapToDouble(D data) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns th action type");
  }
}
