package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.Wrapper0;

class ExecutorBasedOnAction0 extends AbstractExecutor implements Wrapper0<Void> {
  private final Action0<Void> wrappedAction;

  ExecutorBasedOnAction0(Action0<Void> action) {
    this.wrappedAction = action;
  }

  @Override
  public Void execute() {
    wrappedAction.execute();
    return null;
  }

  @Override
  public Action0<Void> wrappedAction() {
    return wrappedAction;
  }
}
