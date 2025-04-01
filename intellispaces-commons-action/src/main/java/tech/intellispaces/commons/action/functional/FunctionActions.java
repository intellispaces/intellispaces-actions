package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.Action1;
import tech.intellispaces.commons.action.Action10;
import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.Action3;
import tech.intellispaces.commons.action.Action4;
import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.Action6;
import tech.intellispaces.commons.action.Action7;
import tech.intellispaces.commons.action.Action8;
import tech.intellispaces.commons.action.Action9;
import tech.intellispaces.commons.action.supplier.SupplierActions;
import tech.intellispaces.commons.function.Function10;
import tech.intellispaces.commons.function.Function4;
import tech.intellispaces.commons.function.Function5;
import tech.intellispaces.commons.function.Consumer3;
import tech.intellispaces.commons.function.Function3;
import tech.intellispaces.commons.function.Function6;
import tech.intellispaces.commons.function.Function7;
import tech.intellispaces.commons.function.Function8;
import tech.intellispaces.commons.function.Function9;
import tech.intellispaces.commons.function.primitive.ObjectAndDoubleToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndDoubleToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndDoubleToObjectFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntAndDoubleToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntAndDoubleToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntAndDoubleToObjectFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndIntToObjectFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToObjectFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToIntFunction;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToObjectFunction;
import tech.intellispaces.commons.function.primitive.ObjectToIntFunction;
import tech.intellispaces.commons.function.primitive.ThreeObjectsToDoubleFunction;
import tech.intellispaces.commons.function.primitive.ThreeObjectsToIntFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndDoubleToDoubleFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndDoubleToIntFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndDoubleToObjectFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndIntToDoubleFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndIntToIntFunction;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndIntToObjectFunction;
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
 * The provider of function based actions.
 */
public interface FunctionActions {

  static <R> Action0<R> ofSupplier(Supplier<R> supplier) {
    return ofSupplier(supplier, (Type<R>) null);
  }

  static <R> Action0<R> ofSupplier(Supplier<R> supplier, Class<R> resultClass) {
    return ofSupplier(supplier, Types.get(resultClass));
  }

  static <R> Action0<R> ofSupplier(Supplier<R> supplier, Type<R> resultType) {
    return SupplierActions.get(supplier);
  }

  static Action0<Integer> ofIntSupplier(IntSupplier supplier) {
    return SupplierActions.get(supplier);
  }

  static Action0<Double> ofDoubleSupplier(DoubleSupplier supplier) {
    return SupplierActions.get(supplier);
  }

  static <D> Action1<Void, D> ofConsumer(Consumer<D> consumer) {
    return ofConsumer(consumer, (Type<D>) null);
  }

  static <D> Action1<Void, D> ofConsumer(Consumer<D> consumer, Class<D> dataClass) {
    return ofConsumer(consumer, Types.get(dataClass));
  }

  static <D> Action1<Void, D> ofConsumer(Consumer<D> consumer, Type<D> dataType) {
    return new ConsumerAction<>(consumer);
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(BiConsumer<D1, D2> consumer) {
    return ofBiConsumer(consumer, (Type<D1>) null, null);
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(
      BiConsumer<D1, D2> consumer, Class<D1> dataClass1, Class<D2> dataClass2
  ) {
    return ofBiConsumer(consumer, Types.get(dataClass1), Types.get(dataClass2));
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(
      BiConsumer<D1, D2> consumer, Type<D1> dataType1, Type<D2> dataType2
  ) {
    return new BiConsumerAction<>(consumer);
  }

  static <D1, D2, D3> Action3<Void, D1, D2, D3> ofConsumer3(Consumer3<D1, D2, D3> consumer) {
    return ofConsumer3(consumer, (Type<D1>) null, null, null);
  }

  static <D1, D2, D3> Action3<Void, D1, D2, D3> ofConsumer3(
      Consumer3<D1, D2, D3> consumer, Class<D1> dataClass1, Class<D2> dataClass2, Class<D3> dataClass3
  ) {
    return ofConsumer3(consumer, Types.get(dataClass1), Types.get(dataClass2), Types.get(dataClass3));
  }

  static <D1, D2, D3> Action3<Void, D1, D2, D3> ofConsumer3(
      Consumer3<D1, D2, D3> consumer, Type<D1> dataType1, Type<D2> dataType2, Type<D3> dataType3
  ) {
    return new TriConsumerAction<>(consumer);
  }

  static <R, D> Action1<R, D> ofFunction(Function<D, R> function) {
    return ofFunction(function, (Type<R>) null, null);
  }

  static <R> Action1<R, Integer> ofFunction(IntFunction<R> function) {
    return new IntegerToObjectAction<>(function);
  }

  static <D> Action1<Integer, D> ofFunction(ToIntFunction<D> function) {
    return new ObjectToIntFunctionAction<>(function);
  }

  static <R, D> Action1<R, D> ofFunction(
      Function<D, R> function, Class<R> resultClass, Class<D> dataClass
  ) {
    return ofFunction(function, Types.get(resultClass), Types.get(dataClass));
  }

  static <R, D> Action1<R, D> ofFunction(
      Function<D, R> function, Type<R> resultType, Type<D> dataType
  ) {
    return new FunctionalAction1<>(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(BiFunction<D1, D2, R> function) {
    return ofBiFunction(function, (Type<R>) null, null, null);
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(
    BiFunction<D1, D2, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2
  ) {
    return ofBiFunction(function, Types.get(resultClass), Types.get(dataClass1), Types.get(dataClass2));
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(
      BiFunction<D1, D2, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2
  ) {
    return new FunctionalAction2<>(function);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofFunction3(
      Function3<D1, D2, D3, R> function)
  {
    return ofFunction3(function, (Type<R>) null, null, null, null);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofFunction3(
    Function3<D1, D2, D3, R> function,
    Class<R> resultClass,
    Class<D1> dataClass1,
    Class<D2> dataClass2,
    Class<D3> dataClass3
  ) {
    return ofFunction3(
        function, Types.get(resultClass), Types.get(dataClass1), Types.get(dataClass2), Types.get(dataClass3)
    );
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofFunction3(
      Function3<D1, D2, D3, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3
  ) {
    return new FunctionalAction3<>(function);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> ofFunction4(
      Function4<D1, D2, D3, D4, R> function
  ) {
    return ofFunction4(function, (Type<R>) null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> ofFunction4(
      Function4<D1, D2, D3, D4, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4
  ) {
    return ofFunction4(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4)
    );
  }

  static <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> ofFunction4(
      Function4<D1, D2, D3, D4, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4
  ) {
    return new FunctionalAction4<>(function);
  }

  static <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> ofFunction5(
      Function5<D1, D2, D3, D4, D5, R> function
  ) {
    return ofFunction5(function, (Type<R>) null, null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> ofFunction5(
      Function5<D1, D2, D3, D4, D5, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5
  ) {
    return ofFunction5(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4),
        Types.get(dataClass5)
    );
  }

  static <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> ofFunction5(
      Function5<D1, D2, D3, D4, D5, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4,
      Type<D5> dataType5
  ) {
    return new FunctionalAction5<>(function);
  }

  static <R, D1, D2, D3, D4, D5, D6> Action6<R, D1, D2, D3, D4, D5, D6> ofFunction6(
      Function6<D1, D2, D3, D4, D5, D6, R> function
  ) {
    return ofFunction6(function, (Type<R>) null, null, null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4, D5, D6> Action6<R, D1, D2, D3, D4, D5, D6> ofFunction6(
      Function6<D1, D2, D3, D4, D5, D6, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5,
      Class<D6> dataClass6
  ) {
    return ofFunction6(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4),
        Types.get(dataClass5),
        Types.get(dataClass6)
    );
  }

  static <R, D1, D2, D3, D4, D5, D6> Action6<R, D1, D2, D3, D4, D5, D6> ofFunction6(
      Function6<D1, D2, D3, D4, D5, D6, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4,
      Type<D5> dataType5,
      Type<D6> dataType6
  ) {
    return new FunctionalAction6<>(function);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7> Action7<R, D1, D2, D3, D4, D5, D6, D7> ofFunction7(
      Function7<D1, D2, D3, D4, D5, D6, D7, R> function
  ) {
    return ofFunction7(function, (Type<R>) null, null, null, null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7> Action7<R, D1, D2, D3, D4, D5, D6, D7> ofFunction7(
      Function7<D1, D2, D3, D4, D5, D6, D7, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5,
      Class<D6> dataClass6,
      Class<D7> dataClass7
  ) {
    return ofFunction7(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4),
        Types.get(dataClass5),
        Types.get(dataClass6),
        Types.get(dataClass7)
    );
  }

  static <R, D1, D2, D3, D4, D5, D6, D7> Action7<R, D1, D2, D3, D4, D5, D6, D7> ofFunction7(
      Function7<D1, D2, D3, D4, D5, D6, D7, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4,
      Type<D5> dataType5,
      Type<D6> dataType6,
      Type<D7> dataType7
  ) {
    return new FunctionalAction7<>(function);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8> Action8<R, D1, D2, D3, D4, D5, D6, D7, D8> ofFunction8(
      Function8<D1, D2, D3, D4, D5, D6, D7, D8, R> function
  ) {
    return ofFunction8(function, (Type<R>) null, null, null, null, null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8> Action8<R, D1, D2, D3, D4, D5, D6, D7, D8> ofFunction8(
      Function8<D1, D2, D3, D4, D5, D6, D7, D8, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5,
      Class<D6> dataClass6,
      Class<D7> dataClass7,
      Class<D8> dataClass8
  ) {
    return ofFunction8(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4),
        Types.get(dataClass5),
        Types.get(dataClass6),
        Types.get(dataClass7),
        Types.get(dataClass8)
    );
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8> Action8<R, D1, D2, D3, D4, D5, D6, D7, D8> ofFunction8(
      Function8<D1, D2, D3, D4, D5, D6, D7, D8, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4,
      Type<D5> dataType5,
      Type<D6> dataType6,
      Type<D7> dataType7,
      Type<D8> dataType8
  ) {
    return new FunctionalAction8<>(function);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8, D9> Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> ofFunction9(
      Function9<D1, D2, D3, D4, D5, D6, D7, D8, D9, R> function
  ) {
    return ofFunction9(function, (Type<R>) null, null, null, null, null, null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8, D9> Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> ofFunction9(
      Function9<D1, D2, D3, D4, D5, D6, D7, D8, D9, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5,
      Class<D6> dataClass6,
      Class<D7> dataClass7,
      Class<D8> dataClass8,
      Class<D9> dataClass9
  ) {
    return ofFunction9(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4),
        Types.get(dataClass5),
        Types.get(dataClass6),
        Types.get(dataClass7),
        Types.get(dataClass8),
        Types.get(dataClass9)
    );
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8, D9> Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> ofFunction9(
      Function9<D1, D2, D3, D4, D5, D6, D7, D8, D9, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4,
      Type<D5> dataType5,
      Type<D6> dataType6,
      Type<D7> dataType7,
      Type<D8> dataType8,
      Type<D9> dataType9
  ) {
    return new FunctionalAction9<>(function);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> Action10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> ofFunction10(
      Function10<D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, R> function
  ) {
    return ofFunction10(function, (Type<R>) null, null, null, null, null, null, null, null, null, null, null);
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> Action10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> ofFunction10(
      Function10<D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, R> function,
      Class<R> resultClass,
      Class<D1> dataClass1,
      Class<D2> dataClass2,
      Class<D3> dataClass3,
      Class<D4> dataClass4,
      Class<D5> dataClass5,
      Class<D6> dataClass6,
      Class<D7> dataClass7,
      Class<D8> dataClass8,
      Class<D9> dataClass9,
      Class<D10> dataClass10
  ) {
    return ofFunction10(
        function,
        Types.get(resultClass),
        Types.get(dataClass1),
        Types.get(dataClass2),
        Types.get(dataClass3),
        Types.get(dataClass4),
        Types.get(dataClass5),
        Types.get(dataClass6),
        Types.get(dataClass7),
        Types.get(dataClass8),
        Types.get(dataClass9),
        Types.get(dataClass10)
    );
  }

  static <R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> Action10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> ofFunction10(
      Function10<D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, R> function,
      Type<R> resultType,
      Type<D1> dataType1,
      Type<D2> dataType2,
      Type<D3> dataType3,
      Type<D4> dataType4,
      Type<D5> dataType5,
      Type<D6> dataType6,
      Type<D7> dataType7,
      Type<D8> dataType8,
      Type<D9> dataType9,
      Type<D10> dataType10
  ) {
    return new FunctionalAction10<>(function);
  }

  static <D> Action1<Integer, D> ofObjectToIntFunction(ObjectToIntFunction<D> function) {
    return ofObjectToIntFunction(function, Integer.class, null);
  }

  static <D> Action1<Integer, D> ofObjectToIntFunction(
      ObjectToIntFunction<D> function, Class<Integer> resultClass, Class<D> dataClass
  ) {
    return new ObjectToIntFunctionAction<>(function);
  }

  static <D> Action1<Double, D> ofObjectToDoubleFunction(ToDoubleFunction<D> function) {
    return ofObjectToDoubleFunction(function, Double.class, null);
  }

  static <D> Action1<Double, D> ofObjectToDoubleFunction(
      ToDoubleFunction<D> function, Class<Double> resultClass, Class<D> dataClass
  ) {
    return new ObjectToDoubleFunctionAction<>(function);
  }

  static <D1, D2> Action2<Integer, D1, D2> ofTwoObjectsToIntFunction(TwoObjectsToIntFunction<D1, D2> function) {
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

  static <D1, D2> Action2<Double, D1, D2> ofTwoObjectsToDoubleFunction(TwoObjectsToDoubleFunction<D1, D2> function) {
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

  static <D> Action2<Integer, D, Integer> ofObjectAndIntToIntFunction(ObjectAndIntToIntFunction<D> function) {
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

  static <D> Action2<Double, D, Integer> ofObjectAndIntToDoubleFunction(ObjectAndIntToDoubleFunction<D> function) {
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

  static <R, D> Action2<R, D, Integer> ofObjectAndIntToObjectFunction(ObjectAndIntToObjectFunction<D, R> function) {
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

  static <D> Action2<Integer, D, Double> ofObjectAndDoubleToIntFunction(ObjectAndDoubleToIntFunction<D> function) {
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

  static <D> Action2<Double, D, Double> ofObjectAndDoubleToDoubleFunction(ObjectAndDoubleToDoubleFunction<D> function) {
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
