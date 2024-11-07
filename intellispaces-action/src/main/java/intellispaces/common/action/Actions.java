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
import intellispaces.common.base.function.primitive.ObjectAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToIntFunction;
import intellispaces.common.base.function.primitive.ObjectToDoubleFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToDoubleFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToIntFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToIntFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndIntToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndIntToIntFunction;
import intellispaces.common.base.function.primitive.TwoObjectsToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsToIntFunction;
import intellispaces.common.base.type.Type;
import intellispaces.common.base.type.Types;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
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

  static <D1, D2> Action2<Integer, D1, D2> of(
      TwoObjectsToIntFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsToIntFunction(function);
  }

  static <D> Action2<Integer, D, Integer> of(
      ObjectAndIntToIntFunction<D> function
  ) {
    return FunctionActions.ofObjectAndIntToIntFunction(function);
  }

  static <D> Action2<Integer, D, Double> of(
      ObjectAndDoubleToIntFunction<D> function
  ) {
    return FunctionActions.ofObjectAndDoubleToIntFunction(function);
  }

  static <D1, D2> Action2<Double, D1, D2> of(
      TwoObjectsToDoubleFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsToDoubleFunction(function);
  }

  static <D> Action2<Double, D, Integer> of(
      ObjectAndIntToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndIntToDoubleFunction(function);
  }

  static <D> Action2<Double, D, Double> of(
      ObjectAndDoubleToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndDoubleToDoubleFunction(function);
  }

  static <D1, D2, D3> Action3<Integer, D1, D2, D3> of(
      ThreeObjectsToIntFunction<D1, D2, D3> function
  ) {
    return FunctionActions.ofThreeObjectsToIntFunction(function);
  }

  static <D1, D2> Action3<Integer, D1, D2, Integer> of(
      TwoObjectsAndIntToIntFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndIntToIntFunction(function);
  }

  static <D1, D2> Action3<Integer, D1, D2, Double> of(
      TwoObjectsAndDoubleToIntFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndDoubleToIntFunction(function);
  }

  static <D> Action3<Integer, D, Integer, Integer> of(
      ObjectAndTwoIntsToIntFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoIntsToIntFunction(function);
  }

  static <D> Action3<Integer, D, Integer, Double> of(
      ObjectAndIntAndDoubleToIntFunction<D> function
  ) {
    return FunctionActions.ofObjectAndIntAndDoubleToIntFunction(function);
  }

  static <D> Action3<Integer, D, Double, Double> of(
      ObjectAndTwoDoublesToIntFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoDoublesToIntFunction(function);
  }

  static <D1, D2, D3> Action3<Double, D1, D2, D3> of(
      ThreeObjectsToDoubleFunction<D1, D2, D3> function
  ) {
    return FunctionActions.ofThreeObjectsToDoubleFunction(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Integer> of(
      TwoObjectsAndIntToDoubleFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndIntToDoubleFunction(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Double> of(
      TwoObjectsAndDoubleToDoubleFunction<D1, D2> function
  ) {
    return FunctionActions.ofTwoObjectsAndDoubleToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Integer, Integer> of(
      ObjectAndTwoIntsToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndTwoIntsToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Integer, Double> of(
      ObjectAndIntAndDoubleToDoubleFunction<D> function
  ) {
    return FunctionActions.ofObjectAndIntAndDoubleToDoubleFunction(function);
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
    return ResettableGetterActions.get(Types.get(resultClass));
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
