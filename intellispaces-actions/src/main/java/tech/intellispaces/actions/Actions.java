package tech.intellispaces.actions;

import tech.intellispaces.actions.delegate.Delegate0;
import tech.intellispaces.actions.delegate.Delegate1;
import tech.intellispaces.actions.delegate.Delegate2;
import tech.intellispaces.actions.delegate.Delegate3;
import tech.intellispaces.actions.delegate.Delegate4;
import tech.intellispaces.actions.delegate.Delegate5;
import tech.intellispaces.actions.delegate.Delegates;
import tech.intellispaces.actions.executor.Executor;
import tech.intellispaces.actions.executor.Executors;
import tech.intellispaces.actions.functional.FunctionalActions;
import tech.intellispaces.actions.getter.Getter;
import tech.intellispaces.actions.getter.Getters;
import tech.intellispaces.actions.getter.ResettableGetter;
import tech.intellispaces.actions.getter.ResettableGetters;
import tech.intellispaces.actions.processor.Processor1;
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

  static Action0<Void> get(Runnable runnable) {
    return executor(runnable);
  }

  static <R> Action0<R> get(Supplier<R> supplier) {
    return FunctionalActions.get(supplier);
  }

  static <R> Action1<Void, R> get(Consumer<R> consumer) {
    return FunctionalActions.get(consumer);
  }

  static <R, D> Action1<R, D> get(Function<D, R> function) {
    return FunctionalActions.get(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> get(BiFunction<D1, D2, R> function) {
    return FunctionalActions.get(function);
  }

  static <R> Action0<R> get(Supplier<R> supplier, Class<R> resultClass) {
    return FunctionalActions.get(supplier);
  }

  static <R, D> Action1<R, D> get(Function<D, R> function, Class<R> resultClass, Class<D> dataClass) {
    return FunctionalActions.get(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> get(
      BiFunction<D1, D2, R> function, Class<R> resultClass, Class<D1> dataClass1, Class<D2> dataClass2
  ) {
    return FunctionalActions.get(function);
  }

  static Executor executor(Runnable runnable) {
    return Executors.of(runnable);
  }

  static <D> Executor executor(Consumer<D> consumer, D value) {
    return Executors.of(consumer, value);
  }

  static <R> Getter<R> getter(R value) {
    return Getters.of(value);
  }

  static <R> ResettableGetter<R> resettableGetter() {
    return ResettableGetters.get();
  }

  static <R> ResettableGetter<R> resettableGetter(R initValue) {
    return ResettableGetters.get(initValue);
  }

  /**
   * Builds getter action on base given supplier.
   *
   * @param supplier value supplier
   * @param <R> getter result value type.
   * @return getter action.
   */
  static <R> Getter<R> cachedLazyGetter(Supplier<R> supplier) {
    return Getters.cachedLazy(supplier);
  }

  /**
   * Builds getter action on base given value and calculating function.
   *
   * @param function calculating function.
   * @param arg function argument.
   * @param <R> getter result value type.
   * @param <D> type of the function argument.
   * @return getter action.
   */
  static <R, D> Getter<R> cachedLazyGetter(Function<D, R> function, D arg) {
    return Getters.cachedLazy(function, arg);
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
  static <R, D1, D2> Getter<R> cachedLazyGetter(
      BiFunction<D1, D2, R> function, D1 arg1, D2 arg2
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
   * @param <R> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @param <D3> type of the third function argument.
   * @return getter action.
   */
  static <R, D1, D2, D3> Getter<R> cachedLazyGetter(
      TriFunction<D1, D2, D3, R> function, D1 arg1, D2 arg2, D3 arg3
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
   * @param <R> getter result value type.
   * @param <D1> type of the first function argument.
   * @param <D2> type of the second function argument.
   * @param <D3> type of the third function argument.
   * @param <D4> type of the fourth function argument.
   * @return getter action.
   */
  static <R, D1, D2, D3, D4> Getter<R> cachedLazyGetter(
      QuadFunction<D1, D2, D3, D4, R> function, D1 arg1, D2 arg2, D3 arg3, D4 arg4
  ) {
    return Getters.cachedLazy(function, arg1, arg2, arg3, arg4);
  }

  static <R> Processor1<R> processor(Consumer<R> consumer) {
    return Processors.of(consumer);
  }

  static <R> Delegate0<R> delegate0(
      Getter<Action0<R>> contractor
  ) {
    return Delegates.delegate0(contractor);
  }

  static <R, D> Delegate1<R, D> delegate1(
      Getter<Action1<R, D>> contractor
  ) {
    return Delegates.delegate1(contractor);
  }

  static <R, D1, D2> Delegate2<R, D1, D2> delegate2(
      Getter<Action2<R, D1, D2>> contractor
  ) {
    return Delegates.delegate2(contractor);
  }

  static <R, D1, D2, D3> Delegate3<R, D1, D2, D3> delegate3(
      Getter<Action3<R, D1, D2, D3>> contractor
  ) {
    return Delegates.delegate3(contractor);
  }

  static <R, D1, D2, D3, D4> Delegate4<R, D1, D2, D3, D4> delegate4(
      Getter<Action4<R, D1, D2, D3, D4>> contractor
  ) {
    return Delegates.delegate4(contractor);
  }

  static <R, D1, D2, D3, D4, D5> Delegate5<R, D1, D2, D3, D4, D5> delegate5(
      Getter<Action5<R, D1, D2, D3, D4, D5>> contractor
  ) {
    return Delegates.delegate5(contractor);
  }
}
