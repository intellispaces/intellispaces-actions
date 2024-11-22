package tech.intellispaces.action.broker;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.action.supplier.AbstractSupplierAction;

public class BrokerAction0BasedOnContractor<R>
    extends AbstractSupplierAction<Action0<R>>
    implements BrokerAction0<R>
{
  private final Action0<R> contractor;

  BrokerAction0BasedOnContractor(Action0<R> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action0<R> get() {
    return contractor;
  }

  @Override
  public int getInt() {
    throw IrregularActionTypeExceptions.withMessage("Broker action does not return primitive type");
  }

  @Override
  public double getDouble() {
    throw IrregularActionTypeExceptions.withMessage("Broker action does not return primitive type");
  }
}
