package tech.intellispaces.actions.runner;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.Wrapper0;

class RunnerBasedOnAction0 extends AbstractRunner implements Wrapper0<Void> {
  private final Action0<Void> action;

  RunnerBasedOnAction0(Action0<Void> action) {
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
