package tech.intellispaces.framework.commons.action.executor;

import tech.intellispaces.framework.commons.action.Action;
import tech.intellispaces.framework.commons.action.Executor;

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
