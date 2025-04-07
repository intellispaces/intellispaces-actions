package tech.intellispaces.actions.runnable;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.WrapperAction0;

class RunnableActionBasedOnAction0 extends AbstractRunnableAction implements WrapperAction0<Void> {
  private final Action0<Void> action;

  RunnableActionBasedOnAction0(Action0<Void> action) {
    this.action = action;
  }

  @Override
  public void run() {
    action.execute();
  }

  @Override
  public Action0<Void> wrappedAction() {
    return action;
  }
}
