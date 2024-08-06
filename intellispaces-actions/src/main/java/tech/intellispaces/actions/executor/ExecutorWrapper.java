package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Action5;

class ExecutorWrapper extends AbstractExecutor implements Executor {
  private final Action5<Void, Void, Void, Void, Void, Void> action;

  ExecutorWrapper(Action5<Void, Void, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public Void execute() {
    action.execute(null, null, null, null, null);
    return null;
  }
}
