package tech.intellispaces.actions.supplier;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.WrapperAction0;

import java.util.function.Function;

public abstract class AbstractSupplierAction<R> extends AbstractAction0<R> implements SupplierAction<R> {

  @Override
  public R execute() {
    return get();
  }

  @Override
  public int executeReturnInt() {
    return getInt();
  }

  @Override
  public double executeReturnDouble() {
    return getDouble();
  }

  @Override
  public <W extends WrapperAction0<_R>, _R> SupplierAction<_R> wrapSupplierAction(
      Function<Action0<R>, W> wrapperFactory
  ) {
    return new SupplierActionBasedOnAction0<>(wrapperFactory.apply(this));
  }
}
