package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Executor;

import java.util.function.Consumer;

public interface Executors {

  static Executor of(Runnable runnable) {
    return new RunnableBasedExecutor(runnable);
  }

  static <D> Executor of(Consumer<D> consumer, D value) {
    return of(() -> consumer.accept(value));
  }
}
