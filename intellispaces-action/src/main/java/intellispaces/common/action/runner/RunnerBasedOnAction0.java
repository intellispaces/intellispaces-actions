package intellispaces.common.action.runner;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.Wrapper0;

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
