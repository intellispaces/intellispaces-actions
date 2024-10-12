package intellispaces.common.action.functional;

import intellispaces.common.action.Action0;
import intellispaces.common.action.Action1;
import intellispaces.common.action.Action2;
import intellispaces.common.action.Action3;
import intellispaces.common.action.Action4;
import intellispaces.common.action.functional.primitive.DoubleSupplierAction;
import intellispaces.common.action.functional.primitive.IntSupplierAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleToIntFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndIntAndDoubleToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndIntAndDoubleToIntFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndIntAndDoubleToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndIntToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndIntToIntFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndIntToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoDoublesToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoDoublesToIntFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoDoublesToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoIntsToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoIntsToIntFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoIntsToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ThreeObjectsToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ThreeObjectsToIntFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndDoubleToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndDoubleToIntFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndDoubleToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndIntToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndIntToIntFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndIntToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsToIntFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectToIntFunctionAction;
import intellispaces.common.base.function.QuadFunction;
import intellispaces.common.base.function.TriFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndIntToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToIntFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectToIntFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToDoubleFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToIntFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToIntFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToObjectFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndIntToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndIntToIntFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndIntToObjectFunction;
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

public interface FunctionActions {

  static <R> Action0<R> ofSupplier(
      Supplier<R> supplier
  ) {
    return ofSupplier(supplier, (Type<R>) null);
  }

  static <R> Action0<R> ofSupplier(
      Supplier<R> supplier,
      Class<R> resultClass
  ) {
    return ofSupplier(supplier, Types.of(resultClass));
  }

  static <R> Action0<R> ofSupplier(
      Supplier<R> supplier,
      Type<R> resultType
  ) {
    return new FunctionalAction0<>(supplier);
  }

  static Action0<Integer> ofIntSupplier(
      IntSupplier supplier
  ) {
    return new IntSupplierAction(supplier);
  }

  static Action0<Double> ofDoubleSupplier(
      DoubleSupplier supplier
  ) {
    return new DoubleSupplierAction(supplier);
  }

  static <D> Action1<Void, D> ofConsumer(
      Consumer<D> consumer
  ) {
    return ofConsumer(consumer, (Type<D>) null);
  }

  static <D> Action1<Void, D> ofConsumer(
      Consumer<D> consumer,
      Class<D> dataClass
  ) {
    return ofConsumer(consumer, Types.of(dataClass));
  }

  static <D> Action1<Void, D> ofConsumer(
      Consumer<D> consumer,
      Type<D> dataType
  ) {
    return new ConsumerAction<>(consumer);
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(
      BiConsumer<D1, D2> consumer
  ) {
    return ofBiConsumer(consumer, (Type<D1>) null, null);
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(
      BiConsumer<D1, D2> consumer,
      Class<D1> dataClass1,
      Class<D2> dataClass2
  ) {
    return ofBiConsumer(consumer, Types.of(dataClass1), Types.of(dataClass2));
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(
      BiConsumer<D1, D2> consumer,
      Type<D1> dataType1,
      Type<D2> dataType2
  ) {
    return new BiConsumerAction<>(consumer);
  }

  static <R, D> Action1<R, D> ofFunction(
      Function<D, R> function
  ) {
    return ofFunction(function, (Type<R>) null, null);
  }

  static <R, D> Action1<R, D> ofFunction(
      Function<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass
  ) {
    return ofFunction(function, Types.of(resultClass), Types.of(dataClass));
  }

  static <R, D> Action1<R, D> ofFunction(
      Function<D, R> function,
      Type<R> resultType,
      Type<D> dataType
  ) {
    return new FunctionalAction1<>(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(
      BiFunction<D1, D2, R> function
  ) {
    return ofBiFunction(function, (Type<R>) null, null, null);
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(
    BiFunction<D1, D2, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2
  ) {
    return ofBiFunction(function, Types.of(resultClass), Types.of(dataClass1), Types.of(dataClass2));
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(
      BiFunction<D1, D2, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2
  ) {
    return new FunctionalAction2<>(function);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofTriFunction(
      TriFunction<D1, D2, D3, R> function)
  {
    return ofTriFunction(function, (Type<R>) null, null, null, null);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofTriFunction(
    TriFunction<D1, D2, D3, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2,
    Class<D3> dataClass3
  ) {
    return ofTriFunction(
        function, Types.of(resultClass), Types.of(dataClass1), Types.of(dataClass2), Types.of(dataClass3)
    );
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofTriFunction(
      TriFunction<D1, D2, D3, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3
  ) {
    return new FunctionalAction3<>(function);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> ofQuadFunction(
      QuadFunction<D1, D2, D3, D4, R> function
  ) {
    return ofQuadFunction(function, (Type<R>) null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> ofQuadFunction(
      QuadFunction<D1, D2, D3, D4, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4
  ) {
    return ofQuadFunction(
        function, Types.of(resultClass), Types.of(dataClass1), Types.of(dataClass2), Types.of(dataClass3), Types.of(dataClass4)
    );
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> ofQuadFunction(
      QuadFunction<D1, D2, D3, D4, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4
  ) {
    return new FunctionalAction4<>(function);
  }

  static <D> Action1<Integer, D> ofObjectToIntFunction(
      ObjectToIntFunction<D> function
  ) {
    return ofObjectToIntFunction(function, Integer.class, null);
  }

  static <D> Action1<Integer, D> ofObjectToIntFunction(
      ObjectToIntFunction<D> function,
      Class<Integer> resultClass,
      Class<D> dataClass
  ) {
    return new ObjectToIntFunctionAction<>(function);
  }

  static <D> Action1<Double, D> ofObjectToDoubleFunction(
      ObjectToDoubleFunction<D> function
  ) {
    return ofObjectToDoubleFunction(function, Double.class, null);
  }

  static <D> Action1<Double, D> ofObjectToDoubleFunction(
      ObjectToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass
  ) {
    return new ObjectToDoubleFunctionAction<>(function);
  }

  static <D1, D2> Action2<Integer, D1, D2> ofTwoObjectsToIntFunction(
      TwoObjectsToIntFunction<D1, D2> function
  ) {
    return ofTwoObjectsToIntFunction(function, Integer.class, null, null);
  }

  static <D1, D2> Action2<Integer, D1, D2> ofTwoObjectsToIntFunction(
      TwoObjectsToIntFunction<D1, D2> function,
      Class<Integer> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2
  ) {
    return new TwoObjectsToIntFunctionAction<>(function);
  }

  static <D1, D2> Action2<Double, D1, D2> ofTwoObjectsToDoubleFunction(
      TwoObjectsToDoubleFunction<D1, D2> function
  ) {
    return ofTwoObjectsToDoubleFunction(function, Double.class, null, null);
  }

  static <D1, D2> Action2<Double, D1, D2> ofTwoObjectsToDoubleFunction(
      TwoObjectsToDoubleFunction<D1, D2> function,
      Class<Double> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2
  ) {
    return new TwoObjectsToDoubleFunctionAction<>(function);
  }

  static <D> Action2<Integer, D, Integer> ofObjectAndIntToIntFunction(
      ObjectAndIntToIntFunction<D> function
  ) {
    return ofObjectAndIntToIntFunction(function, Integer.class, null, Integer.class);
  }

  static <D> Action2<Integer, D, Integer> ofObjectAndIntToIntFunction(
      ObjectAndIntToIntFunction<D> function,
      Class<Integer> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2
  ) {
    return new ObjectAndIntToIntFunctionAction<>(function);
  }

  static <D> Action2<Double, D, Integer> ofObjectAndIntToDoubleFunction(
      ObjectAndIntToDoubleFunction<D> function
  ) {
    return ofObjectAndIntToDoubleFunction(function, Double.class, null, Integer.class);
  }

  static <D> Action2<Double, D, Integer> ofObjectAndIntToDoubleFunction(
      ObjectAndIntToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2
  ) {
    return new ObjectAndIntToDoubleFunctionAction<>(function);
  }

  static <R, D> Action2<R, D, Integer> ofObjectAndIntToObjectFunction(
      ObjectAndIntToObjectFunction<D, R> function
  ) {
    return ofObjectAndIntToObjectFunction(function, null, null, Integer.class);
  }

  static <R, D> Action2<R, D, Integer> ofObjectAndIntToObjectFunction(
      ObjectAndIntToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2
  ) {
    return new ObjectAndIntToObjectFunctionAction<>(function);
  }

  static <D> Action2<Integer, D, Double> ofObjectAndDoubleToIntFunction(
      ObjectAndDoubleToIntFunction<D> function
  ) {
    return ofObjectAndDoubleToIntFunction(function, Integer.class, null, Double.class);
  }

  static <D> Action2<Integer, D, Double> ofObjectAndDoubleToIntFunction(
      ObjectAndDoubleToIntFunction<D> function,
      Class<Integer> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2
  ) {
    return new ObjectAndDoubleToIntFunctionAction<>(function);
  }

  static <D> Action2<Double, D, Double> ofObjectAndDoubleToDoubleFunction(
      ObjectAndDoubleToDoubleFunction<D> function
  ) {
    return ofObjectAndDoubleToDoubleFunction(function, Double.class, null, Double.class);
  }

  static <D> Action2<Double, D, Double> ofObjectAndDoubleToDoubleFunction(
      ObjectAndDoubleToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2
  ) {
    return new ObjectAndDoubleToDoubleFunctionAction<>(function);
  }

  static <R, D> Action2<R, D, Double> ofObjectAndDoubleToObjectFunction(
      ObjectAndDoubleToObjectFunction<D, R> function
  ) {
    return ofObjectAndDoubleToObjectFunction(function, null, null, Double.class);
  }

  static <R, D> Action2<R, D, Double> ofObjectAndDoubleToObjectFunction(
      ObjectAndDoubleToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2
  ) {
    return new ObjectAndDoubleToObjectFunctionAction<>(function);
  }

  static <D1, D2, D3> Action3<Integer, D1, D2, D3> ofThreeObjectsToIntFunction(
      ThreeObjectsToIntFunction<D1, D2, D3> function
  ) {
    return ofThreeObjectsToIntFunction(function, Integer.class, null, null, null);
  }

  static <D1, D2, D3> Action3<Integer, D1, D2, D3> ofThreeObjectsToIntFunction(
      ThreeObjectsToIntFunction<D1, D2, D3> function,
      Class<Integer> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3
  ) {
    return new ThreeObjectsToIntFunctionAction<>(function);
  }

  static <D1, D2, D3> Action3<Double, D1, D2, D3> ofThreeObjectsToDoubleFunction(
      ThreeObjectsToDoubleFunction<D1, D2, D3> function
  ) {
    return ofThreeObjectsToDoubleFunction(function, Double.class, null, null, null);
  }

  static <D1, D2, D3> Action3<Double, D1, D2, D3> ofThreeObjectsToDoubleFunction(
      ThreeObjectsToDoubleFunction<D1, D2, D3> function,
      Class<Double> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3
  ) {
    return new ThreeObjectsToDoubleFunctionAction<>(function);
  }

  static <D1, D2> Action3<Integer, D1, D2, Integer> ofTwoObjectsAndIntToIntFunction(
      TwoObjectsAndIntToIntFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndIntToIntFunction(function, Integer.class, null, null, Integer.class);
  }

  static <D1, D2> Action3<Integer, D1, D2, Integer> ofTwoObjectsAndIntToIntFunction(
      TwoObjectsAndIntToIntFunction<D1, D2> function,
      Class<Integer> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Integer> dataClass3
  ) {
    return new TwoObjectsAndIntToIntFunctionAction<>(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Integer> ofTwoObjectsAndIntToDoubleFunction(
      TwoObjectsAndIntToDoubleFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndIntToDoubleFunction(function, Double.class, null, null, Integer.class);
  }

  static <D1, D2> Action3<Double, D1, D2, Integer> ofTwoObjectsAndIntToDoubleFunction(
      TwoObjectsAndIntToDoubleFunction<D1, D2> function,
      Class<Double> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Integer> dataClass3
  ) {
    return new TwoObjectsAndIntToDoubleFunctionAction<>(function);
  }

  static <R, D1, D2> Action3<R, D1, D2, Integer> ofTwoObjectsAndIntToObjectFunction(
      TwoObjectsAndIntToObjectFunction<D1, D2, R> function
  ) {
    return ofTwoObjectsAndIntToObjectFunction(function, null, null, null, Integer.class);
  }

  static <R, D1, D2> Action3<R, D1, D2, Integer> ofTwoObjectsAndIntToObjectFunction(
      TwoObjectsAndIntToObjectFunction<D1, D2, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Integer> dataClass3
  ) {
    return new TwoObjectsAndIntToObjectFunctionAction<>(function);
  }

  static <D1, D2> Action3<Integer, D1, D2, Double> ofTwoObjectsAndDoubleToIntFunction(
      TwoObjectsAndDoubleToIntFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndDoubleToIntFunction(function, Integer.class, null, null, Integer.class);
  }

  static <D1, D2> Action3<Integer, D1, D2, Double> ofTwoObjectsAndDoubleToIntFunction(
      TwoObjectsAndDoubleToIntFunction<D1, D2> function,
      Class<Integer> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Integer> dataClass3
  ) {
    return new TwoObjectsAndDoubleToIntFunctionAction<>(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Double> ofTwoObjectsAndDoubleToDoubleFunction(
      TwoObjectsAndDoubleToDoubleFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndDoubleToDoubleFunction(function, Double.class, null, null, Double.class);
  }

  static <D1, D2> Action3<Double, D1, D2, Double> ofTwoObjectsAndDoubleToDoubleFunction(
      TwoObjectsAndDoubleToDoubleFunction<D1, D2> function,
      Class<Double> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Double> dataClass3
  ) {
    return new TwoObjectsAndDoubleToDoubleFunctionAction<>(function);
  }

  static <R, D1, D2> Action3<R, D1, D2, Double> ofTwoObjectsAndDoubleToObjectFunction(
      TwoObjectsAndDoubleToObjectFunction<D1, D2, R> function
  ) {
    return ofTwoObjectsAndDoubleToObjectFunction(function, null, null, null, Double.class);
  }

  static <R, D1, D2> Action3<R, D1, D2, Double> ofTwoObjectsAndDoubleToObjectFunction(
      TwoObjectsAndDoubleToObjectFunction<D1, D2, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Double> dataClass3
  ) {
    return new TwoObjectsAndDoubleToObjectFunctionAction<>(function);
  }

  static <D> Action3<Integer, D, Integer, Integer> ofObjectAndTwoIntsToIntFunction(
      ObjectAndTwoIntsToIntFunction<D> function
  ) {
    return ofObjectAndTwoIntsToIntFunction(function, Integer.class, null, Integer.class, Integer.class);
  }

  static <D> Action3<Integer, D, Integer, Integer> ofObjectAndTwoIntsToIntFunction(
      ObjectAndTwoIntsToIntFunction<D> function,
      Class<Integer> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2,
      Class<Integer> dataClass13
  ) {
    return new ObjectAndTwoIntsToIntFunctionAction<>(function);
  }

  static <D> Action3<Double, D, Integer, Integer> ofObjectAndTwoIntsToDoubleFunction(
      ObjectAndTwoIntsToDoubleFunction<D> function
  ) {
    return ofObjectAndTwoIntsToDoubleFunction(function, Double.class, null, Integer.class, Integer.class);
  }

  static <D> Action3<Double, D, Integer, Integer> ofObjectAndTwoIntsToDoubleFunction
      (ObjectAndTwoIntsToDoubleFunction<D> function,
       Class<Double> resultClass,
       Class<D> dataClass1,
       Class<Integer> dataClass2,
       Class<Integer> dataClass3
      ) {
    return new ObjectAndTwoIntsToDoubleFunctionAction<>(function);
  }

  static <R, D> Action3<R, D, Integer, Integer> ofObjectAndTwoIntsToObjectFunction(
      ObjectAndTwoIntsToObjectFunction<D, R> function
  ) {
    return ofObjectAndTwoIntsToObjectFunction(function, null, null, Integer.class, Integer.class);
  }

  static <R, D> Action3<R, D, Integer, Integer> ofObjectAndTwoIntsToObjectFunction
      (ObjectAndTwoIntsToObjectFunction<D, R> function,
       Class<R> resultClass,
       Class<D> dataClass1,
       Class<Integer> dataClass2,
       Class<Integer> dataClass3
      ) {
    return new ObjectAndTwoIntsToObjectFunctionAction<>(function);
  }

  static <D> Action3<Integer, D, Integer, Double> ofObjectAndIntAndDoubleToIntFunction(
      ObjectAndIntAndDoubleToIntFunction<D> function
  ) {
    return ofObjectAndIntAndDoubleToIntFunction(function, Integer.class, null, Integer.class, Double.class);
  }

  static <D> Action3<Integer, D, Integer, Double> ofObjectAndIntAndDoubleToIntFunction(
      ObjectAndIntAndDoubleToIntFunction<D> function,
      Class<Integer> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndIntAndDoubleToIntFunctionAction<>(function);
  }

  static <D> Action3<Double, D, Integer, Double> ofObjectAndIntAndDoubleToDoubleFunction(
      ObjectAndIntAndDoubleToDoubleFunction<D> function
  ) {
    return ofObjectAndIntAndDoubleToDoubleFunction(function, Double.class, null, Integer.class, Double.class);
  }

  static <D> Action3<Double, D, Integer, Double> ofObjectAndIntAndDoubleToDoubleFunction(
      ObjectAndIntAndDoubleToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndIntAndDoubleToDoubleFunctionAction<>(function);
  }

  static <R, D> Action3<R, D, Integer, Double> ofObjectAndIntAndDoubleToObjectFunction(
      ObjectAndIntAndDoubleToObjectFunction<D, R> function
  ) {
    return ofObjectAndIntAndDoubleToObjectFunction(function, null, null, Integer.class, Double.class);
  }

  static <R, D> Action3<R, D, Integer, Double> ofObjectAndIntAndDoubleToObjectFunction(
      ObjectAndIntAndDoubleToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Integer> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndIntAndDoubleToObjectFunctionAction<>(function);
  }

  static <D> Action3<Integer, D, Double, Double> ofObjectAndTwoDoublesToIntFunction(
      ObjectAndTwoDoublesToIntFunction<D> function
  ) {
    return ofObjectAndTwoDoublesToIntFunction(function, Integer.class, null, Double.class, Double.class);
  }

  static <D> Action3<Integer, D, Double, Double> ofObjectAndTwoDoublesToIntFunction(
      ObjectAndTwoDoublesToIntFunction<D> function,
      Class<Integer> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndTwoDoublesToIntFunctionAction<>(function);
  }

  static <D> Action3<Double, D, Double, Double> ofObjectAndTwoDoublesToDoubleFunction(
      ObjectAndTwoDoublesToDoubleFunction<D> function
  ) {
    return ofObjectAndTwoDoublesToDoubleFunction(function, Double.class, null, Double.class, Double.class);
  }

  static <D> Action3<Double, D, Double, Double> ofObjectAndTwoDoublesToDoubleFunction(
      ObjectAndTwoDoublesToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndTwoDoublesToDoubleFunctionAction<>(function);
  }

  static <R, D> Action3<R, D, Double, Double> ofObjectAndTwoDoublesToObjectFunction(
      ObjectAndTwoDoublesToObjectFunction<D, R> function
  ) {
    return ofObjectAndTwoDoublesToObjectFunction(function, null, null, Double.class, Double.class);
  }

  static <R, D> Action3<R, D, Double, Double> ofObjectAndTwoDoublesToObjectFunction(
      ObjectAndTwoDoublesToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndTwoDoublesToObjectFunctionAction<>(function);
  }
}
