package tech.intellispaces.action.cache;

import tech.intellispaces.action.interceptor.cache.CacheInterceptors;
import tech.intellispaces.action.supplier.SupplierAction;
import tech.intellispaces.action.supplier.SupplierActions;
import tech.intellispaces.entity.function.QuadriFunction;
import tech.intellispaces.entity.function.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Provider of cached supplier actions.
 */
public interface CachedSupplierActions {

  /**
   * Returns supplier action based on supplier function.
   *
   * @param supplier value supplier
   * @param <R> the supplier result value type.
   * @return the supplier action.
   */
  static <R> SupplierAction<R> get(Supplier<R> supplier) {
    return SupplierActions.get(supplier)
        .wrapSupplierAction(CacheInterceptors.cacheInterceptorFactory0());
  }

  /**
   * Returns supplier action based on calculating function and single function argument.
   *
   * @param function the calculating function.
   * @param arg the function argument.
   * @param <R> the supplier result data type.
   * @param <D> the type of the function argument.
   * @return supplier action.
   */
  static <R, D> SupplierAction<R> get(Function<D, R> function, D arg) {
    return get(() -> function.apply(arg));
  }

  /**
   * Returns supplier action based on calculating function and the pair of function argument.
   *
   * @param function calculating function.
   * @param arg1 the first function argument.
   * @param arg2 the second function argument.
   * @param <R> the supplier result value type.
   * @param <D1> the type of the first function argument.
   * @param <D2> the type of the second function argument.
   * @return the supplier action.
   */
  static <R, D1, D2> SupplierAction<R> get(
      BiFunction<D1, D2, R> function,
      D1 arg1,
      D2 arg2
  ) {
    return get(() -> function.apply(arg1, arg2));
  }

  /**
   * Returns supplier action based on calculating function and three function argument.
   *
   * @param function the calculating function.
   * @param arg1 the first function argument.
   * @param arg2 the second function argument.
   * @param arg3 the third function argument.
   * @param <R> the supplier result value type.
   * @param <D1> the type of the first function argument.
   * @param <D2> the type of the second function argument.
   * @param <D3> the type of the third function argument.
   * @return the supplier action.
   */
  static <R, D1, D2, D3> SupplierAction<R> get(
      TriFunction<D1, D2, D3, R> function,
      D1 arg1,
      D2 arg2,
      D3 arg3
  ) {
    return get(() -> function.apply(arg1, arg2, arg3));
  }

  /**
   * Returns supplier action based on calculating function and four function argument.
   *
   * @param function calculating function.
   * @param arg1 the first function argument.
   * @param arg2 the second function argument.
   * @param arg3 the third function argument.
   * @param arg4 the fourth source value.
   * @param <R> the supplier result value type.
   * @param <D1> the type of the first function argument.
   * @param <D2> the type of the second function argument.
   * @param <D3> the type of the third function argument.
   * @param <D4> the type of the fourth function argument.
   * @return the supplier action.
   */
  static <R, D1, D2, D3, D4> SupplierAction<R> get(
      QuadriFunction<D1, D2, D3, D4, R> function,
      D1 arg1,
      D2 arg2,
      D3 arg3,
      D4 arg4
  ) {
    return get(() -> function.apply(arg1, arg2, arg3, arg4));
  }
}
