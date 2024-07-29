package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Executor;

class RunnableBasedExecutor extends AbstractExecutor implements Executor {
  private final Runnable runnable;

  RunnableBasedExecutor(Runnable runnable) {
    this.runnable = runnable;
  }

  @Override
  public Void execute() {
    runnable.run();
    return null;
  }
}
