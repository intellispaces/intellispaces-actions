package intellispaces.common.action.runner;

class RunnableBasedRunner extends AbstractRunner implements Runner {
  private final Runnable runnable;

  RunnableBasedRunner(Runnable runnable) {
    this.runnable = runnable;
  }

  @Override
  public void run() {
    runnable.run();
  }
}
