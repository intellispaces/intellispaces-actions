package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.Wrapper5;

class ExecutorBasedOnAction5 extends AbstractExecutor implements Wrapper5<Void, Void, Void, Void, Void, Void> {
  private final Action5<Void, Void, Void, Void, Void, Void> wrappedAction;

  ExecutorBasedOnAction5(Action5<Void, Void, Void, Void, Void, Void> action) {
    this.wrappedAction = action;
  }

  @Override
  public Void execute() {
    wrappedAction.execute(null, null, null, null, null);
    return null;
  }

  @Override
  public Action5<Void, Void, Void, Void, Void, Void> wrappedAction() {
    return wrappedAction;
  }
}
