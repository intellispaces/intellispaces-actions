package intellispaces.common.action.functional;

import intellispaces.common.action.Action0;
import intellispaces.common.action.Action1;
import intellispaces.common.action.Action2;
import intellispaces.common.action.Action3;
import intellispaces.common.action.Action4;
import intellispaces.common.action.functional.primitive.DoubleSupplierAction;
import intellispaces.common.action.functional.primitive.IntSupplierAction;
import intellispaces.common.action.functional.primitive.LongSupplierAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleAndLongToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleAndLongToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleAndLongToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndDoubleToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndLongAndDoubleToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndLongAndDoubleToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndLongAndDoubleToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndLongToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndLongToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndLongToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoDoublesToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoDoublesToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoDoublesToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoLongsToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoLongsToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectAndTwoLongsToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.ThreeObjectsToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ThreeObjectsToLongFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndDoubleToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndDoubleToLongFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndDoubleToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndLongToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndLongToLongFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsAndLongToObjectFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.TwoObjectsToLongFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectToDoubleFunctionAction;
import intellispaces.common.action.functional.primitive.ObjectToLongFunctionAction;
import intellispaces.common.base.function.QuadFunction;
import intellispaces.common.base.function.TriFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongAndDoubleToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToObjectFunction;
import intellispaces.common.base.function.primitive.ObjectToDoubleFunction;
import intellispaces.common.base.function.primitive.ObjectToLongFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToDoubleFunction;
import intellispaces.common.base.function.primitive.ThreeObjectsToLongFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToObjectFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToDoubleFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToLongFunction;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToObjectFunction;
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

  static Action0<Long> ofLongSupplier(
      LongSupplier supplier
  ) {
    return new LongSupplierAction(supplier);
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

  static <D> Action1<Long, D> ofObjectToLongFunction(
      ObjectToLongFunction<D> function
  ) {
    return ofObjectToLongFunction(function, Long.class, null);
  }

  static <D> Action1<Long, D> ofObjectToLongFunction(
      ObjectToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass
  ) {
    return new ObjectToLongFunctionAction<>(function);
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

  static <D1, D2> Action2<Long, D1, D2> ofTwoObjectsToLongFunction(
      TwoObjectsToLongFunction<D1, D2> function
  ) {
    return ofTwoObjectsToLongFunction(function, Long.class, null, null);
  }

  static <D1, D2> Action2<Long, D1, D2> ofTwoObjectsToLongFunction(
      TwoObjectsToLongFunction<D1, D2> function,
      Class<Long> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2
  ) {
    return new TwoObjectsToLongFunctionAction<>(function);
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

  static <D> Action2<Long, D, Long> ofObjectAndLongToLongFunction(
      ObjectAndLongToLongFunction<D> function
  ) {
    return ofObjectAndLongToLongFunction(function, Long.class, null, Long.class);
  }

  static <D> Action2<Long, D, Long> ofObjectAndLongToLongFunction(
      ObjectAndLongToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2
  ) {
    return new ObjectAndLongToLongFunctionAction<>(function);
  }

  static <D> Action2<Double, D, Long> ofObjectAndLongToDoubleFunction(
      ObjectAndLongToDoubleFunction<D> function
  ) {
    return ofObjectAndLongToDoubleFunction(function, Double.class, null, Long.class);
  }

  static <D> Action2<Double, D, Long> ofObjectAndLongToDoubleFunction(
      ObjectAndLongToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2
  ) {
    return new ObjectAndLongToDoubleFunctionAction<>(function);
  }

  static <R, D> Action2<R, D, Long> ofObjectAndLongToObjectFunction(
      ObjectAndLongToObjectFunction<D, R> function
  ) {
    return ofObjectAndLongToObjectFunction(function, null, null, Long.class);
  }

  static <R, D> Action2<R, D, Long> ofObjectAndLongToObjectFunction(
      ObjectAndLongToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2
  ) {
    return new ObjectAndLongToObjectFunctionAction<>(function);
  }

  static <D> Action2<Long, D, Double> ofObjectAndDoubleToLongFunction(
      ObjectAndDoubleToLongFunction<D> function
  ) {
    return ofObjectAndDoubleToLongFunction(function, Long.class, null, Double.class);
  }

  static <D> Action2<Long, D, Double> ofObjectAndDoubleToLongFunction(
      ObjectAndDoubleToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2
  ) {
    return new ObjectAndDoubleToLongFunctionAction<>(function);
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

  static <D1, D2, D3> Action3<Long, D1, D2, D3> ofThreeObjectsToLongFunction(
      ThreeObjectsToLongFunction<D1, D2, D3> function
  ) {
    return ofThreeObjectsToLongFunction(function, Long.class, null, null, null);
  }

  static <D1, D2, D3> Action3<Long, D1, D2, D3> ofThreeObjectsToLongFunction(
      ThreeObjectsToLongFunction<D1, D2, D3> function,
      Class<Long> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3
  ) {
    return new ThreeObjectsToLongFunctionAction<>(function);
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

  static <D1, D2> Action3<Long, D1, D2, Long> ofTwoObjectsAndLongToLongFunction(
      TwoObjectsAndLongToLongFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndLongToLongFunction(function, Long.class, null, null, Long.class);
  }

  static <D1, D2> Action3<Long, D1, D2, Long> ofTwoObjectsAndLongToLongFunction(
      TwoObjectsAndLongToLongFunction<D1, D2> function,
      Class<Long> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Long> dataClass3
  ) {
    return new TwoObjectsAndLongToLongFunctionAction<>(function);
  }

  static <D1, D2> Action3<Double, D1, D2, Long> ofTwoObjectsAndLongToDoubleFunction(
      TwoObjectsAndLongToDoubleFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndLongToDoubleFunction(function, Double.class, null, null, Long.class);
  }

  static <D1, D2> Action3<Double, D1, D2, Long> ofTwoObjectsAndLongToDoubleFunction(
      TwoObjectsAndLongToDoubleFunction<D1, D2> function,
      Class<Double> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Long> dataClass3
  ) {
    return new TwoObjectsAndLongToDoubleFunctionAction<>(function);
  }

  static <R, D1, D2> Action3<R, D1, D2, Long> ofTwoObjectsAndLongToObjectFunction(
      TwoObjectsAndLongToObjectFunction<D1, D2, R> function
  ) {
    return ofTwoObjectsAndLongToObjectFunction(function, null, null, null, Long.class);
  }

  static <R, D1, D2> Action3<R, D1, D2, Long> ofTwoObjectsAndLongToObjectFunction(
      TwoObjectsAndLongToObjectFunction<D1, D2, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Long> dataClass3
  ) {
    return new TwoObjectsAndLongToObjectFunctionAction<>(function);
  }

  static <D1, D2> Action3<Long, D1, D2, Double> ofTwoObjectsAndDoubleToLongFunction(
      TwoObjectsAndDoubleToLongFunction<D1, D2> function
  ) {
    return ofTwoObjectsAndDoubleToLongFunction(function, Long.class, null, null, Long.class);
  }

  static <D1, D2> Action3<Long, D1, D2, Double> ofTwoObjectsAndDoubleToLongFunction(
      TwoObjectsAndDoubleToLongFunction<D1, D2> function,
      Class<Long> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<Long> dataClass3
  ) {
    return new TwoObjectsAndDoubleToLongFunctionAction<>(function);
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

  static <D> Action3<Long, D, Long, Long> ofObjectAndTwoLongsToLongFunction(
      ObjectAndTwoLongsToLongFunction<D> function
  ) {
    return ofObjectAndTwoLongsToLongFunction(function, Long.class, null, Long.class, Long.class);
  }

  static <D> Action3<Long, D, Long, Long> ofObjectAndTwoLongsToLongFunction(
      ObjectAndTwoLongsToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2,
      Class<Long> dataClass13
  ) {
    return new ObjectAndTwoLongsToLongFunctionAction<>(function);
  }

  static <D> Action3<Double, D, Long, Long> ofObjectAndTwoLongsToDoubleFunction(
      ObjectAndTwoLongsToDoubleFunction<D> function
  ) {
    return ofObjectAndTwoLongsToDoubleFunction(function, Double.class, null, Long.class, Long.class);
  }

  static <D> Action3<Double, D, Long, Long> ofObjectAndTwoLongsToDoubleFunction
      (ObjectAndTwoLongsToDoubleFunction<D> function,
       Class<Double> resultClass,
       Class<D> dataClass1,
       Class<Long> dataClass2,
       Class<Long> dataClass3
      ) {
    return new ObjectAndTwoLongsToDoubleFunctionAction<>(function);
  }

  static <R, D> Action3<R, D, Long, Long> ofObjectAndTwoLongsToObjectFunction(
      ObjectAndTwoLongsToObjectFunction<D, R> function
  ) {
    return ofObjectAndTwoLongsToObjectFunction(function, null, null, Long.class, Long.class);
  }

  static <R, D> Action3<R, D, Long, Long> ofObjectAndTwoLongsToObjectFunction
      (ObjectAndTwoLongsToObjectFunction<D, R> function,
       Class<R> resultClass,
       Class<D> dataClass1,
       Class<Long> dataClass2,
       Class<Long> dataClass3
      ) {
    return new ObjectAndTwoLongsToObjectFunctionAction<>(function);
  }

  static <D> Action3<Long, D, Long, Double> ofObjectAndLongAndDoubleToLongFunction(
      ObjectAndLongAndDoubleToLongFunction<D> function
  ) {
    return ofObjectAndLongAndDoubleToLongFunction(function, Long.class, null, Long.class, Double.class);
  }

  static <D> Action3<Long, D, Long, Double> ofObjectAndLongAndDoubleToLongFunction(
      ObjectAndLongAndDoubleToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndLongAndDoubleToLongFunctionAction<>(function);
  }

  static <D> Action3<Double, D, Long, Double> ofObjectAndLongAndDoubleToDoubleFunction(
      ObjectAndLongAndDoubleToDoubleFunction<D> function
  ) {
    return ofObjectAndLongAndDoubleToDoubleFunction(function, Double.class, null, Long.class, Double.class);
  }

  static <D> Action3<Double, D, Long, Double> ofObjectAndLongAndDoubleToDoubleFunction(
      ObjectAndLongAndDoubleToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndLongAndDoubleToDoubleFunctionAction<>(function);
  }

  static <R, D> Action3<R, D, Long, Double> ofObjectAndLongAndDoubleToObjectFunction(
      ObjectAndLongAndDoubleToObjectFunction<D, R> function
  ) {
    return ofObjectAndLongAndDoubleToObjectFunction(function, null, null, Long.class, Double.class);
  }

  static <R, D> Action3<R, D, Long, Double> ofObjectAndLongAndDoubleToObjectFunction(
      ObjectAndLongAndDoubleToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Long> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndLongAndDoubleToObjectFunctionAction<>(function);
  }

  static <D> Action3<Long, D, Double, Long> ofObjectAndDoubleAndLongToLongFunction(
      ObjectAndDoubleAndLongToLongFunction<D> function
  ) {
    return ofObjectAndDoubleAndLongToLongFunction(function, Long.class, null, Double.class, Long.class);
  }

  static <D> Action3<Long, D, Double, Long> ofObjectAndDoubleAndLongToLongFunction(
      ObjectAndDoubleAndLongToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Long> dataClass3
  ) {
    return new ObjectAndDoubleAndLongToLongFunctionAction<>(function);
  }

  static <D> Action3<Double, D, Double, Long> ofObjectAndDoubleAndLongToDoubleFunction(
      ObjectAndDoubleAndLongToDoubleFunction<D> function
  ) {
    return ofObjectAndDoubleAndLongToDoubleFunction(function, Double.class, null, Double.class, Long.class);
  }

  static <D> Action3<Double, D, Double, Long> ofObjectAndDoubleAndLongToDoubleFunction(
      ObjectAndDoubleAndLongToDoubleFunction<D> function,
      Class<Double> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Long> dataClass3
  ) {
    return new ObjectAndDoubleAndLongToDoubleFunctionAction<>(function);
  }

  static <R, D> Action3<R, D, Double, Long> ofObjectAndDoubleAndLongToObjectFunction(
      ObjectAndDoubleAndLongToObjectFunction<D, R> function
  ) {
    return ofObjectAndDoubleAndLongToObjectFunction(function, null, null, Double.class, Long.class);
  }

  static <R, D> Action3<R, D, Double, Long> ofObjectAndDoubleAndLongToObjectFunction(
      ObjectAndDoubleAndLongToObjectFunction<D, R> function,
      Class<R> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Long> dataClass3
  ) {
    return new ObjectAndDoubleAndLongToObjectFunctionAction<>(function);
  }

  static <D> Action3<Long, D, Double, Double> ofObjectAndTwoDoublesToLongFunction(
      ObjectAndTwoDoublesToLongFunction<D> function
  ) {
    return ofObjectAndTwoDoublesToLongFunction(function, Long.class, null, Double.class, Double.class);
  }

  static <D> Action3<Long, D, Double, Double> ofObjectAndTwoDoublesToLongFunction(
      ObjectAndTwoDoublesToLongFunction<D> function,
      Class<Long> resultClass,
      Class<D> dataClass1,
      Class<Double> dataClass2,
      Class<Double> dataClass3
  ) {
    return new ObjectAndTwoDoublesToLongFunctionAction<>(function);
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
