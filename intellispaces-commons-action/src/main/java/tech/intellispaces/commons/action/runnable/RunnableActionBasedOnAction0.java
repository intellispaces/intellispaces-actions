package tech.intellispaces.commons.action.runnable;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

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
