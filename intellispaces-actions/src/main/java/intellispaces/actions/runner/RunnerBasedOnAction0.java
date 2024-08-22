package intellispaces.actions.runner;

import intellispaces.actions.wrapper.Wrapper0;
import intellispaces.actions.Action0;

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
