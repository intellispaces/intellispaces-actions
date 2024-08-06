package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.onetime.CachedFirstTimeOnlyActions;
import tech.intellispaces.commons.function.QuadFunction;
import tech.intellispaces.commons.function.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Getters {

  static <V> Getter<V> of(V value) {
    return new ResettableGetterImpl<>(value);
  }

  /**
   * Builds getter action on base given supplier.
   *
   * @param supplier value supplier
   * @param <V> getter result value type.
   * @return getter action.
   */
  static <V> Getter<V> cachedLazy(Supplier<V> supplier) {
    return new SupplierBasedGetter<>(supplier)
        .wrap(CachedFirstTimeOnlyActions.factory());
  }

  /**
   * Builds getter action on base given value and calculating function.
   *
   * @param function calculating function.
   * @param arg function argument.
   * @param <V> getter result value type.
   * @param <D> type of the function argument.
   * @return getter action.
   */
  static <V, D> Getter<V> cachedLazy(Function<D, V> function, D arg) {
    return cachedLazy(() -> function.apply(arg));
  }

  /**
   * Builds getter action on base given two values and calculating function.
   *
   * @param function calculating function.
   * @param arg1 first function argument.
   * @param arg2 second function argument.
   * @param <V> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @return getter action.
   */
  static <V, D1, D2> Getter<V> cachedLazy(
      BiFunction<D1, D2, V> function, D1 arg1, D2 arg2
  ) {
    return cachedLazy(() -> function.apply(arg1, arg2));
  }

  /**
   * Builds getter action on base given three values and calculating function.
   *
   * @param function calculating function.
   * @param arg1 first function argument.
   * @param arg2 second function argument.
   * @param arg3 third function argument.
   * @param <V> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @param <D3> type of the third function argument.
   * @return getter action.
   */
  static <V, D1, D2, D3> Getter<V> cachedLazy(
      TriFunction<D1, D2, D3, V> function, D1 arg1, D2 arg2, D3 arg3
  ) {
    return cachedLazy(() -> function.apply(arg1, arg2, arg3));
  }

  /**
   * Builds getter action on base given four values and calculating function.
   *
   * @param function calculating function.
   * @param arg1 first function argument.
   * @param arg2 second function argument.
   * @param arg3 third function argument.
   * @param arg4 fourth source value.
   * @param <V> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @param <D3> type of the third function argument.
   * @param <D4> type of the fourth function argument.
   * @return getter action.
   */
  static <V, D1, D2, D3, D4> Getter<V> cachedLazy(
      QuadFunction<D1, D2, D3, D4, V> function, D1 arg1, D2 arg2, D3 arg3, D4 arg4
  ) {
    return cachedLazy(() -> function.apply(arg1, arg2, arg3, arg4));
  }
}
