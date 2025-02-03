package tech.intellispaces.commons.action.broker;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.supplier.AbstractSupplierAction;

import java.util.function.Supplier;

public class BrokerAction0BasedOnSupplier<R>
    extends AbstractSupplierAction<Action0<R>>
    implements BrokerAction0<R>
{
  private final Supplier<Action0<R>> contractor;

  BrokerAction0BasedOnSupplier(Supplier<Action0<R>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action0<R> get() {
    return contractor.get();
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
