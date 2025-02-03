package tech.intellispaces.commons.action.runnable;

class RunnableBasedRunnableAction extends AbstractRunnableAction implements RunnableAction {
  private final Runnable runnable;

  RunnableBasedRunnableAction(Runnable runnable) {
    this.runnable = runnable;
  }

  @Override
  public void run() {
    runnable.run();
  }
}
