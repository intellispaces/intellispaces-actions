package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.Executor;

class ExecutorWrapper extends AbstractExecutor implements Executor {
  private final Action<Void, Void, Void, Void, Void, Void> action;

  ExecutorWrapper(Action<Void, Void, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public Void execute() {
    action.execute(null, null, null, null, null);
    return null;
  }
}
