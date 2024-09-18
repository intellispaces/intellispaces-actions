package intellispaces.common.action.runner;

import java.util.function.Consumer;

public interface RunnerActions {

  static Runner of(Runnable runnable) {
    return new RunnableBasedRunner(runnable);
  }

  static <D> Runner of(Consumer<D> consumer, D value) {
    return of(() -> consumer.accept(value));
  }
}
