package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Action2;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface FunctionalActions {

  static <R, D> Action1<R, D> get(Function<D, R> function) {
    return new FunctionalAction1<>(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> get(BiFunction<D1, D2, R> function) {
    return new FunctionalAction2<>(function);
  }
}
