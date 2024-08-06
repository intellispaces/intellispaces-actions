package tech.intellispaces.actions.executor;

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
