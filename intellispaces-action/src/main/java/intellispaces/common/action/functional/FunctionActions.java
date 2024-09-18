package intellispaces.common.action.functional;

import intellispaces.common.action.Action1;
import intellispaces.common.action.Action2;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.TriFunction;
import intellispaces.common.base.type.SimpleTypes;
import intellispaces.common.base.type.Type;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface FunctionActions {

  static <R, D> Action1<R, D> of(Function<D, R> function) {
    return ofFunction(function, null, null);
  }

  static <R, D> Action1<R, D> of(Function<D, R> function, Type<R> resultType, Type<D> dataType) {
    return ofFunction(function, resultType, dataType);
  }

  static <R, D> Action1<R, D> of(Function<D, R> function, Class<R> resultClass, Class<D> dataClass) {
    return ofFunction(function, SimpleTypes.of(resultClass), SimpleTypes.of(dataClass));
  }

  static <R, D1, D2> Action2<R, D1, D2> of(
    BiFunction<D1, D2, R> function, Type<R> resultType, Type<D1> dataType1, Type<D2> dataType2
  ) {
    return ofBiFunction(function, resultType, dataType1, dataType2);
  }

  static <R, D1, D2> Action2<R, D1, D2> of(BiFunction<D1, D2, R> function) {
    return ofBiFunction(function, null, null, null);
  }

  static <R, D1, D2> Action2<R, D1, D2> of(
    BiFunction<D1, D2, R> function, Class<R> resultClass, Class<D1> dataClass1, Class<D2> dataClass2
  ) {
    return ofBiFunction(function, SimpleTypes.of(resultClass), SimpleTypes.of(dataClass1), SimpleTypes.of(dataClass2));
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> of(TriFunction<D1, D2, D3, R> function) {
    return ofTriFunction(function, null, null, null, null);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> of(
    TriFunction<D1, D2, D3, R> function, Type<R> resultType, Type<D1> dataType1, Type<D2> dataType2, Type<D3> dataType3
  ) {
    return ofTriFunction(function, resultType, dataType1, dataType2, dataType3);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> of(
    TriFunction<D1, D2, D3, R> function, Class<R> resultClass, Class<D1> dataClass1, Class<D2> dataClass2, Class<D3> dataClass3
  ) {
    return ofTriFunction(function, SimpleTypes.of(resultClass), SimpleTypes.of(dataClass1), SimpleTypes.of(dataClass2), SimpleTypes.of(dataClass3));
  }

  static <R, D> Action1<R, D> ofFunction(Function<D, R> function, Type<R> resultType, Type<D> dataType) {
    return new FunctionalAction1<>(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(
    BiFunction<D1, D2, R> function, Type<R> resultType, Type<D1> dataType1, Type<D2> dataType2
  ) {
    return new FunctionalAction2<>(function);
  }

  static <R, D1, D2, D3> Action3<R, D1, D2, D3> ofTriFunction(
    TriFunction<D1, D2, D3, R> function, Type<R> resultType, Type<D1> dataType1, Type<D2> dataType2, Type<D3> dataType3
  ) {
    return new FunctionalAction3<>(function);
  }
}
