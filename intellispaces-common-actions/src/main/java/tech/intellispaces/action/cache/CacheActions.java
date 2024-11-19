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
 * Provider of cache actions.
 */
public interface CacheActions {

  /**
   * Builds getter action on base given supplier.
   *
   * @param supplier value supplier
   * @param <R> getter result value type.
   * @return getter action.
   */
  static <R> SupplierAction<R> cachedLazySupplierAction(Supplier<R> supplier) {
    return SupplierActions.get(supplier)
        .wrapSupplierAction(CacheInterceptors.cacheInterceptorFactory0());
  }

  /**
   * Builds getter action on base given value and calculating function.
   *
   * @param function calculating function.
   * @param arg function argument.
   * @param <R> getter result data type.
   * @param <D> type of the function argument.
   * @return getter action.
   */
  static <R, D> SupplierAction<R> cachedLazySupplierAction(Function<D, R> function, D arg) {
    return cachedLazySupplierAction(() -> function.apply(arg));
  }

  /**
   * Builds getter action on base given two values and calculating function.
   *
   * @param function calculating function.
   * @param arg1 first function argument.
   * @param arg2 second function argument.
   * @param <R> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @return getter action.
   */
  static <R, D1, D2> SupplierAction<R> cachedLazySupplierAction(
      BiFunction<D1, D2, R> function,
      D1 arg1,
      D2 arg2
  ) {
    return cachedLazySupplierAction(() -> function.apply(arg1, arg2));
  }

  /**
   * Builds getter action on base given three values and calculating function.
   *
   * @param function calculating function.
   * @param arg1 first function argument.
   * @param arg2 second function argument.
   * @param arg3 third function argument.
   * @param <R> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @param <D3> type of the third function argument.
   * @return getter action.
   */
  static <R, D1, D2, D3> SupplierAction<R> cachedLazySupplierAction(
      TriFunction<D1, D2, D3, R> function,
      D1 arg1,
      D2 arg2,
      D3 arg3
  ) {
    return cachedLazySupplierAction(() -> function.apply(arg1, arg2, arg3));
  }

  /**
   * Builds getter action on base given four values and calculating function.
   *
   * @param function calculating function.
   * @param arg1 first function argument.
   * @param arg2 second function argument.
   * @param arg3 third function argument.
   * @param arg4 fourth source value.
   * @param <R> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @param <D3> type of the third function argument.
   * @param <D4> type of the fourth function argument.
   * @return getter action.
   */
  static <R, D1, D2, D3, D4> SupplierAction<R> cachedLazySupplierAction(
      QuadriFunction<D1, D2, D3, D4, R> function,
      D1 arg1,
      D2 arg2,
      D3 arg3,
      D4 arg4
  ) {
    return cachedLazySupplierAction(() -> function.apply(arg1, arg2, arg3, arg4));
  }
}
