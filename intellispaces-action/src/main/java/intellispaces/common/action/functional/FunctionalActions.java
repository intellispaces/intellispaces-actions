package intellispaces.common.action.functional;

import intellispaces.common.action.Action2;
import intellispaces.common.action.Action0;
import intellispaces.common.action.Action1;

import java.util.function.*;

public interface FunctionalActions {

  static <R> Action0<R> ofSupplier(Supplier<R> supplier) {
    return new FunctionalAction0<>(supplier);
  }

  static <D> Action1<Void, D> ofConsumer(Consumer<D> consumer) {
    return new ConsumerAction<>(consumer);
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(BiConsumer<D1, D2> consumer) {
    return new BiConsumerAction<>(consumer);
  }

  static <R, D> Action1<R, D> ofFunction(Function<D, R> function) {
    return new FunctionalAction1<>(function);
  }

  static <R, D1, D2> Action2<R, D1, D2> ofBiFunction(BiFunction<D1, D2, R> function) {
    return new FunctionalAction2<>(function);
  }
}
