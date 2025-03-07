package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.functional.FunctionActions;
import tech.intellispaces.commons.action.processor.ProcessorAction1;
import tech.intellispaces.commons.action.processor.ProcessorActions;
import tech.intellispaces.commons.action.runnable.RunnableAction;
import tech.intellispaces.commons.action.runnable.RunnableActions;
import tech.intellispaces.commons.action.supplier.ResettableSupplierAction;
import tech.intellispaces.commons.action.supplier.ResettableSupplierActions;
import tech.intellispaces.commons.action.supplier.SupplierAction;
import tech.intellispaces.commons.action.supplier.SupplierActions;
import tech.intellispaces.commons.function.QuadriConsumer;
import tech.intellispaces.commons.function.QuadriFunction;
import tech.intellispaces.commons.function.QuintiConsumer;
import tech.intellispaces.commons.function.QuintiFunction;
import tech.intellispaces.commons.function.SexiConsumer;
import tech.intellispaces.commons.function.TriConsumer;
import tech.intellispaces.commons.function.TriFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndDoubleToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndDoubleToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntAndDoubleToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntAndDoubleToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToIntFunction;
import tech.intellispaces.commons.function.primitive.ThreeObjectsToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ThreeObjectsToIntFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndDoubleToDoubleFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndDoubleToIntFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndIntToDoubleFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndIntToIntFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsToDoubleFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsToIntFunction;
import tech.intellispaces.commons.type.Type;
import tech.intellispaces.commons.type.Types;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 * General action provider.
 */
public interface Actions {

  static Action0<Void> get(Runnable runnable) {
    return runnableAction(runnable);
  }

  static <R> Action1<Void, R> get(Consumer<R> consumer
  ) {
    return FunctionActions.ofConsumer(consumer);
  }

  static <D> Action1<Void, D> get(Consumer<D> consumer, Type<D> dataType) {
    return FunctionActions.ofConsumer(consumer, dataType);
  }

  static <D> Action1<Void, D> get(Consumer<D> consumer, Class<D> dataClass) {
    return FunctionActions.ofConsumer(consumer, dataClass);
  }

  static <D1, D2> Action2<Void, D1, D2> get(
    BiConsumer<D1, D2> consumer,
    Class<D1> dataClass1,
    Class<D2> dataClass2
  ) {
    return FunctionActions.ofBiConsumer(consumer, dataClass1, dataClass2);
  }

  static Action0<Integer> get(IntSupplier supplier) {
    return FunctionActions.ofIntSupplier(supplier);
  }

  static Action0<Double> get(DoubleSupplier supplier) {
    return FunctionActions.ofDoubleSupplier(supplier);
  }

  static <R> Action0<R> get(Supplier<R> supplier) {
    return FunctionActions.ofSupplier(supplier);
  }

  static <R> Action0<R> get(Supplier<R> supplier, Class<R> resultClass) {
    return FunctionActions.ofSupplier(supplier, resultClass);
  }

  static <R, D> Action1<R, D> get(Function<D, R> function) {
    return FunctionActions.ofFunction(function);
  }

  static <R> Action1<R, Integer> get(IntFunction<R> function) {
    return FunctionActions.ofFunction(function);
  }

  static <D> Action1<Integer, D> get(ToIntFunction<D> function) {
    return FunctionActions.ofFunction(function);
  }

  static <D> Action1<Double, D> get(ToDoubleFunction<D> function) {
    return FunctionActions.ofObjectToDoubleFunction(function);
  }

  static <R, D> Action1<R, D> get(
      Function<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass
  ) {
    return FunctionActions.ofFunction(function, resultClass, dataClass);
  }

  static <R, D1, D2> Action2<R, D1, D2> get(BiFunction<D1, D2, R> function) {
    return FunctionActions.ofBiFunction(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> get(
    BiFunction<D1, D2, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2
  ) {
    return FunctionActions.ofBiFunction(function, resultClass, dataClass1, dataClass2);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> get(TriFunction<D1, D2, D3, R> function) {
    return FunctionActions.ofTriFunction(function);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> get(QuadriFunction<D1, D2, D3, D4, R> function) {
    return FunctionActions.ofQuadriFunction(function);
  }

  static <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> get(QuintiFunction<D1, D2, D3, D4, D5, R> function) {
    return FunctionActions.ofQuintiFunction(function);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> get(
    TriFunction<D1, D2, D3, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2,
    Class<D3> dataClass3
  ) {
    return FunctionActions.ofTriFunction(function, resultClass, dataClass1, dataClass2, dataClass3);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> get(
      QuadriFunction<D1, D2, D3, D4, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4
  ) {
    return FunctionActions.ofQuadriFunction(function, resultClass, dataClass1, dataClass2, dataClass3, dataClass4);
  }

  static <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> get(
      QuintiFunction<D1, D2, D3, D4, D5, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5
  ) {
    return FunctionActions.ofQuintiFunction(
        function, resultClass, dataClass1, dataClass2, dataClass3, dataClass4, dataClass5
    );
  }

  static <D1, D2> Action2<Integer, D1, D2> get(TwoObjectsToIntFunction<D1, D2> function) {
    return FunctionActions.ofTwoObjectsToIntFunction(function);
  }

  static <D> Action2<Integer, D, Integer> get(ObjectAndIntToIntFunction<D> function) {
    return FunctionActions.ofObjectAndIntToIntFunction(function);
  }

  static <D> Action2<Integer, D, Double> get(ObjectAndDoubleToIntFunction<D> function) {
    return FunctionActions.ofObjectAndDoubleToIntFunction(function);
  }

  static <D1, D2> Action2<Double, D1, D2> get(TwoObjectsToDoubleFunction<D1, D2> function) {
    return FunctionActions.ofTwoObjectsToDoubleFunction(function);
  }

  static <D> Action2<Double, D, Integer> get(ObjectAndIntToDoubleFunction<D> function) {
    return FunctionActions.ofObjectAndIntToDoubleFunction(function);
  }

  static <D> Action2<Double, D, Double> get(ObjectAndDoubleToDoubleFunction<D> function) {
    return FunctionActions.ofObjectAndDoubleToDoubleFunction(function);
  }

  static <D1, D2, D3> Action3<Integer, D1, D2, D3> get(ThreeObjectsToIntFunction<D1, D2, D3> function) {
    return FunctionActions.ofThreeObjectsToIntFunction(function);
  }

  static <D1, D2> Action3<Integer, D1, D2, Integer> get(TwoObjectsAndIntToIntFunction<D1, D2> function) {
    return FunctionActions.ofTwoObjectsAndIntToIntFunction(function);
  }

  static <D1, D2> Action3<Integer, D1, D2, Double> get(TwoObjectsAndDoubleToIntFunction<D1, D2> function) {
    return FunctionActions.ofTwoObjectsAndDoubleToIntFunction(function);
  }

  static <D> Action3<Integer, D, Integer, Integer> get(ObjectAndTwoIntsToIntFunction<D> function) {
    return FunctionActions.ofObjectAndTwoIntsToIntFunction(function);
  }

  static <D> Action3<Integer, D, Integer, Double> get(ObjectAndIntAndDoubleToIntFunction<D> function) {
    return FunctionActions.ofObjectAndIntAndDoubleToIntFunction(function);
  }

  static <D> Action3<Integer, D, Double, Double> get(ObjectAndTwoDoublesToIntFunction<D> function) {
    return FunctionActions.ofObjectAndTwoDoublesToIntFunction(function);
  }

  static <D1, D2, D3> Action3<Double, D1, D2, D3> get(ThreeObjectsToDoubleFunction<D1, D2, D3> function) {
    return FunctionActions.ofThreeObjectsToDoubleFunction(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Integer> get(TwoObjectsAndIntToDoubleFunction<D1, D2> function) {
    return FunctionActions.ofTwoObjectsAndIntToDoubleFunction(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Double> get(TwoObjectsAndDoubleToDoubleFunction<D1, D2> function) {
    return FunctionActions.ofTwoObjectsAndDoubleToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Integer, Integer> get(ObjectAndTwoIntsToDoubleFunction<D> function) {
    return FunctionActions.ofObjectAndTwoIntsToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Integer, Double> get(ObjectAndIntAndDoubleToDoubleFunction<D> function) {
    return FunctionActions.ofObjectAndIntAndDoubleToDoubleFunction(function);
  }

  static <D> Action3<Double, D, Double, Double> get(ObjectAndTwoDoublesToDoubleFunction<D> function) {
    return FunctionActions.ofObjectAndTwoDoublesToDoubleFunction(function);
  }

  static RunnableAction runnableAction(Runnable runnable) {
    return RunnableActions.get(runnable);
  }

  static <D> RunnableAction runnableAction(Consumer<D> consumer, D data) {
    return RunnableActions.get(consumer, data);
  }

  static <D1, D2> RunnableAction runnableAction(BiConsumer<D1, D2> consumer, D1 data1, D2 data2) {
    return RunnableActions.get(consumer, data1, data2);
  }

  static <D1, D2, D3> RunnableAction runnableAction(TriConsumer<D1, D2, D3> consumer, D1 data1, D2 data2, D3 data3) {
    return RunnableActions.get(consumer, data1, data2, data3);
  }

  static <D1, D2, D3, D4> RunnableAction runnableAction(
      QuadriConsumer<D1, D2, D3, D4> consumer, D1 data1, D2 data2, D3 data3, D4 data4
  ) {
    return RunnableActions.get(consumer, data1, data2, data3, data4);
  }

  static <D1, D2, D3, D4, D5> RunnableAction runnableAction(
      QuintiConsumer<D1, D2, D3, D4, D5> consumer, D1 data1, D2 data2, D3 data3, D4 data4, D5 data5
  ) {
    return RunnableActions.get(consumer, data1, data2, data3, data4, data5);
  }

  static <D1, D2, D3, D4, D5, D6> RunnableAction runnableAction(
      SexiConsumer<D1, D2, D3, D4, D5, D6> consumer, D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6
  ) {
    return RunnableActions.get(consumer, data1, data2, data3, data4, data5, data6);
  }

  static <R> SupplierAction<R> supplierAction(R data) {
    return SupplierActions.get(data);
  }

  static <R> Action0<R> action0(Action1<R, Void> action1) {
    return new Action0BasedOnAction1<>(action1);
  }

  static <R> ResettableSupplierAction<R> resettableSupplierAction(Type<R> resultType) {
    return ResettableSupplierActions.get(resultType);
  }

  static <R> ResettableSupplierAction<R> resettableSupplierAction(Class<R> resultClass) {
    return ResettableSupplierActions.get(Types.get(resultClass));
  }

  static <R> ResettableSupplierAction<R> resettableSupplierAction(R initValue) {
    return ResettableSupplierActions.get(initValue);
  }

  static <D> ProcessorAction1<D> processorAction(Consumer<D> consumer) {
    return ProcessorActions.get(consumer);
  }
}
