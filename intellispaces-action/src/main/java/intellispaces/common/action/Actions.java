package intellispaces.common.action;

import intellispaces.common.action.delegate.Delegate0;
import intellispaces.common.action.delegate.Delegate1;
import intellispaces.common.action.delegate.Delegate2;
import intellispaces.common.action.delegate.Delegate3;
import intellispaces.common.action.delegate.Delegate4;
import intellispaces.common.action.delegate.Delegate5;
import intellispaces.common.action.delegate.DelegateActions;
import intellispaces.common.action.functional.FunctionActions;
import intellispaces.common.action.getter.Getter;
import intellispaces.common.action.getter.GetterActions;
import intellispaces.common.action.getter.ResettableGetter;
import intellispaces.common.action.getter.ResettableGetterActions;
import intellispaces.common.action.processor.Processor1;
import intellispaces.common.action.processor.Processors;
import intellispaces.common.action.runner.Runner;
import intellispaces.common.action.runner.RunnerActions;
import intellispaces.common.base.function.QuadFunction;
import intellispaces.common.base.function.TriFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToLongFunction;
import intellispaces.common.base.function.primitive.ObjectToDoubleFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToDoubleFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToLongFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToLongFunction;
import intellispaces.common.base.function.primitive.TwoObjectsToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsToLongFunction;
import intellispaces.common.base.type.Type;
import intellispaces.common.base.type.Types;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * Actions facade.
 */
public interface Actions {

  static Action0<Void> of(
      Runnable runnable
  ) {
    return runner(runnable);
  }

  static <R> Action1<Void, R> of(
      Consumer<R> consumer
  ) {
    return FunctionActions.ofConsumer(consumer);
  }

  static <D> Action1<Void, D> of(
      Consumer<D> consumer, Type<D> dataType
  ) {
    return FunctionActions.ofConsumer(consumer, dataType);
  }

  static <D> Action1<Void, D> of(
      Consumer<D> consumer,
      Class<D> dataClass
  ) {
    return FunctionActions.ofConsumer(consumer, dataClass);
  }

  static <D1, D2> Action2<Void, D1, D2> of(
    BiConsumer<D1, D2> consumer,
    Class<D1> dataClass1,
    Class<D2> dataClass2
  ) {
    return FunctionActions.ofBiConsumer(consumer, dataClass1, dataClass2);
  }

  static Action0<Integer> of(
      IntSupplier supplier
  ) {
    return FunctionActions.ofIntSupplier(supplier);
  }

  static Action0<Long> of(
      LongSupplier supplier
  ) {
    return FunctionActions.ofLongSupplier(supplier);
  }

  static Action0<Double> of(
      DoubleSupplier supplier
  ) {
    return FunctionActions.ofDoubleSupplier(supplier);
  }

  static <R> Action0<R> of(
      Supplier<R> supplier
  ) {
    return FunctionActions.ofSupplier(supplier);
  }

  static <R> Action0<R> of(
      Supplier<R> supplier,
      Class<R> resultClass
  ) {
    return FunctionActions.ofSupplier(supplier, resultClass);
  }

  static <R, D> Action1<R, D> of(
      Function<D, R> function
  ) {
    return FunctionActions.ofFunction(function);
  }

  static <R, D> Action1<R, D> of(
      Function<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass
  ) {
    return FunctionActions.ofFunction(function, resultClass, dataClass);
  }

  static <R, D1, D2> Action2<R, D1, D2> of(
      BiFunction<D1, D2, R> function
  ) {
    return FunctionActions.ofBiFunction(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> of(
    BiFunction<D1, D2, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2
  ) {
    return FunctionActions.ofBiFunction(function, resultClass, dataClass1, dataClass2);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> of(
      TriFunction<D1, D2, D3, R> function
  ) {
    return FunctionActions.ofTriFunction(function);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> of(
      QuadFunction<D1, D2, D3, D4, R> function
  ) {
    return FunctionActions.ofQuadFunction(function);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> of(
    TriFunction<D1, D2, D3, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2,
    Class<D3> dataClass3
  ) {
    return FunctionActions.ofTriFunction(function, resultClass, dataClass1, dataClass2, dataClass3);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> of(
      QuadFunction<D1, D2, D3, D4, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4
  ) {
    return FunctionActions.ofQuadFunction(function, resultClass, dataClass1, dataClass2, dataClass3, dataClass4);
  }

  static <D> Action1<Double, D> of(
      ObjectToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectToDoubleFunction(function);
  }

  static <D1, D2> Action2<Long, D1, D2> of(
      TwoObjectsToLongFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsToLongFunction(function);
  }

  static <D> Action2<Long, D, Long> of(
      ObjectAndLongToLongFunction<D> function
  ) {
    return FunctionActions.ofObjectAndLongToLongFunction(function);
  }

  static <D> Action2<Long, D, Double> of(
      ObjectAndDoubleToLongFunction<D> function
  ) {
    return FunctionActions.ofObjectAndDoubleToLongFunction(function);
  }

  static <D1, D2> Action2<Double, D1, D2> of(
      TwoObjectsToDoubleFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsToDoubleFunction(function);
  }

  static <D> Action2<Double, D, Long> of(
      ObjectAndLongToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndLongToDoubleFunction(function);
  }

  static <D> Action2<Double, D, Double> of(
      ObjectAndDoubleToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndDoubleToDoubleFunction(function);
  }

  static <D1, D2, D3> Action3<Long, D1, D2, D3> of(
      ThreeObjectsToLongFunction<D1, D2, D3> function
  ) {
    return FunctionActions.ofThreeObjectsToLongFunction(function);
  }

  static <D1, D2> Action3<Long, D1, D2, Long> of(
      TwoObjectsAndLongToLongFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndLongToLongFunction(function);
  }

  static <D1, D2> Action3<Long, D1, D2, Double> of(
      TwoObjectsAndDoubleToLongFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndDoubleToLongFunction(function);
  }

  static <D> Action3<Long, D, Long, Long> of(
      ObjectAndTwoLongsToLongFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoLongsToLongFunction(function);
  }

  static <D> Action3<Long, D, Long, Double> of(
      ObjectAndLongAndDoubleToLongFunction<D> function
  ) {
    return FunctionActions.ofObjectAndLongAndDoubleToLongFunction(function);
  }

  static <D> Action3<Long, D, Double, Long> of(
      ObjectAndDoubleAndLongToLongFunction<D> function
  ) {
    return FunctionActions.ofObjectAndDoubleAndLongToLongFunction(function);
  }

  static <D> Action3<Long, D, Double, Double> of(
      ObjectAndTwoDoublesToLongFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoDoublesToLongFunction(function);
  }

  static <D1, D2, D3> Action3<Double, D1, D2, D3> of(
      ThreeObjectsToDoubleFunction<D1, D2, D3> function
  ) {
    return FunctionActions.ofThreeObjectsToDoubleFunction(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Long> of(
      TwoObjectsAndLongToDoubleFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndLongToDoubleFunction(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Double> of(
      TwoObjectsAndDoubleToDoubleFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndDoubleToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Long, Long> of(
      ObjectAndTwoLongsToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoLongsToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Long, Double> of(
      ObjectAndLongAndDoubleToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndLongAndDoubleToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Double, Long> of(
      ObjectAndDoubleAndLongToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndDoubleAndLongToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Double, Double> of(
      ObjectAndTwoDoublesToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoDoublesToDoubleFunction(function);
  }

  static Runner runner(
      Runnable runnable
  ) {
    return RunnerActions.of(runnable);
  }

  static <D> Runner runner(
      Consumer<D> consumer,
      D value
  ) {
    return RunnerActions.of(consumer, value);
  }

  static <R> Getter<R> getter(
      R value
  ) {
    return GetterActions.of(value);
  }

  static <R> ResettableGetter<R> resettableGetter(
      Type<R> resultType
  ) {
    return ResettableGetterActions.get(resultType);
  }

  static <R> ResettableGetter<R> resettableGetter(
      Class<R> resultClass
  ) {
    return ResettableGetterActions.get(Types.of(resultClass));
  }

  static <R> ResettableGetter<R> resettableGetter(
      R initValue
  ) {
    return ResettableGetterActions.get(initValue);
  }

  /**
   * Builds getter action on base given supplier.
   *
   * @param supplier value supplier
   * @param <R> getter result value type.
   * @return getter action.
   */
  static <R> Getter<R> cachedLazyGetter(
      Supplier<R> supplier
  ) {
    return GetterActions.cachedLazy(supplier);
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
  static <R, D> Getter<R> cachedLazyGetter(
      Function<D, R> function,
      D arg
  ) {
    return GetterActions.cachedLazy(function, arg);
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
      BiFunction<D1, D2, R> function,
      D1 arg1,
      D2 arg2
  ) {
    return GetterActions.cachedLazy(function, arg1, arg2);
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
      TriFunction<D1, D2, D3, R> function,
      D1 arg1,
      D2 arg2,
      D3 arg3
  ) {
    return GetterActions.cachedLazy(function, arg1, arg2, arg3);
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
      QuadFunction<D1, D2, D3, D4, R> function,
      D1 arg1,
      D2 arg2,
      D3 arg3,
      D4 arg4
  ) {
    return GetterActions.cachedLazy(function, arg1, arg2, arg3, arg4);
  }

  static <D> Processor1<D> processor(
      Consumer<D> consumer
  ) {
    return Processors.of(consumer);
  }

  static <R> Delegate0<R> delegate0(
      Getter<Action0<R>> contractor
  ) {
    return DelegateActions.delegate0(contractor);
  }

  static <R, D> Delegate1<R, D> delegate1(
      Getter<Action1<R, D>> contractor
  ) {
    return DelegateActions.delegate1(contractor);
  }

  static <R, D1, D2> Delegate2<R, D1, D2> delegate2(
      Getter<Action2<R, D1, D2>> contractor
  ) {
    return DelegateActions.delegate2(contractor);
  }

  static <R, D1, D2, D3> Delegate3<R, D1, D2, D3> delegate3(
      Getter<Action3<R, D1, D2, D3>> contractor
  ) {
    return DelegateActions.delegate3(contractor);
  }

  static <R, D1, D2, D3, D4> Delegate4<R, D1, D2, D3, D4> delegate4(
      Getter<Action4<R, D1, D2, D3, D4>> contractor
  ) {
    return DelegateActions.delegate4(contractor);
  }

  static <R, D1, D2, D3, D4, D5> Delegate5<R, D1, D2, D3, D4, D5> delegate5(
      Getter<Action5<R, D1, D2, D3, D4, D5>> contractor
  ) {
    return DelegateActions.delegate5(contractor);
  }
}
