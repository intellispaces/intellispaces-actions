package tech.intellispaces.actions;

import tech.intellispaces.actions.executor.Executors;
import tech.intellispaces.actions.getter.Getters;
import tech.intellispaces.actions.getter.ResettableGetters;
import tech.intellispaces.actions.onetime.CachedFirstTimeOnlyActions;
import tech.intellispaces.actions.onetime.FirstTimeOnlyActions;
import tech.intellispaces.actions.onetime.NotFirstTimeOnlyActions;
import tech.intellispaces.actions.processor.Processors;
import tech.intellispaces.commons.function.QuadFunction;
import tech.intellispaces.commons.function.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Actions facade.
 */
public interface Actions {

  static Executor executor(Runnable runnable) {
    return Executors.of(runnable);
  }

  static <D> Executor executor(Consumer<D> consumer, D value) {
    return Executors.of(consumer, value);
  }

  static <V> Getter<V> getter(V value) {
    return Getters.of(value);
  }

  static <V> ResettableGetter<V> resettableGetter() {
    return ResettableGetters.get();
  }

  static <V> ResettableGetter<V> resettableGetter(V initValue) {
    return ResettableGetters.get(initValue);
  }

  /**
   * Builds getter action on base given supplier.
   *
   * @param supplier value supplier
   * @param <V> getter result value type.
   * @return getter action.
   */
  static <V> Getter<V> cachedLazyGetter(Supplier<V> supplier) {
    return Getters.cachedLazy(supplier);
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
  static <V, D> Getter<V> cachedLazyGetter(Function<D, V> function, D arg) {
    return Getters.cachedLazy(function, arg);
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
  static <V, D1, D2> Getter<V> cachedLazyGetter(
      BiFunction<D1, D2, V> function, D1 arg1, D2 arg2
  ) {
    return Getters.cachedLazy(function, arg1, arg2);
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
  static <V, D1, D2, D3> Getter<V> cachedLazyGetter(
      TriFunction<D1, D2, D3, V> function, D1 arg1, D2 arg2, D3 arg3
  ) {
    return Getters.cachedLazy(function, arg1, arg2, arg3);
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
  static <V, D1, D2, D3, D4> Getter<V> cachedLazyGetter(
      QuadFunction<D1, D2, D3, D4, V> function, D1 arg1, D2 arg2, D3 arg3, D4 arg4
  ) {
    return Getters.cachedLazy(function, arg1, arg2, arg3, arg4);
  }

  static <D> Processor1<D> processor(Consumer<D> consumer) {
    return Processors.of(consumer);
  }

  static <V, D1, D2, D3, D4, D5> Function<Action<V, D1, D2, D3, D4, D5>, Action<V, D1, D2, D3, D4, D5>> firstTimeOnlyActionFactory() {
    return FirstTimeOnlyActions.factory();
  }

  static <V, D1, D2, D3, D4, D5> Function<Action<V, D1, D2, D3, D4, D5>, Action<V, D1, D2, D3, D4, D5>> cachedFirstTimeOnlyActionFactory() {
    return CachedFirstTimeOnlyActions.factory();
  }

  static <V, D1, D2, D3, D4, D5> Function<Action<V, D1, D2, D3, D4, D5>, Action<V, D1, D2, D3, D4, D5>> notFirstTimeOnlyActionFactory() {
    return NotFirstTimeOnlyActions.factory();
  }
}
