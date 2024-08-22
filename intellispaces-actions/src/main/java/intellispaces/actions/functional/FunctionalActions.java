package intellispaces.actions.functional;

import intellispaces.actions.Action2;
import intellispaces.actions.Action0;
import intellispaces.actions.Action1;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface FunctionalActions {

  static <R> Action0<R> get(Supplier<R> supplier) {
    return new FunctionalAction0<>(supplier);
  }

  static <D> Action1<Void, D> get(Consumer<D> consumer) {
    return new ConsumerAction<>(consumer);
  }

  static <R, D> Action1<R, D> get(Function<D, R> function) {
    return new FunctionalAction1<>(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> get(BiFunction<D1, D2, R> function) {
    return new FunctionalAction2<>(function);
  }
}
