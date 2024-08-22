package intellispaces.actions.runner;

import java.util.function.Consumer;

public interface Runners {

  static Runner of(Runnable runnable) {
    return new RunnableBasedRunner(runnable);
  }

  static <D> Runner of(Consumer<D> consumer, D value) {
    return of(() -> consumer.accept(value));
  }
}
