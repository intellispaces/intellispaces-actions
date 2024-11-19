package tech.intellispaces.action.supplier;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.wrapper.WrapperAction0;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The supplier action.<p/>
 *
 * This action form does not take input data and returns a result data.
 *
 * @param <R> result data type.
 */
public interface SupplierAction<R> extends Action0<R>, Supplier<R> {

  int getInt();

  double getDouble();

  /**
   * Wraps this supplier action using the wrapper factory.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper result data type.
   */
  <W extends WrapperAction0<_R>, _R> SupplierAction<_R> wrapSupplierAction(
      Function<Action0<R>, W> wrapperFactory
  );
}
