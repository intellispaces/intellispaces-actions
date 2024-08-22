package intellispaces.actions.runner;

import intellispaces.actions.Action5;
import intellispaces.actions.wrapper.Wrapper5;

class RunnerBasedOnAction5 extends AbstractRunner implements Wrapper5<Void, Void, Void, Void, Void, Void> {
  private final Action5<Void, Void, Void, Void, Void, Void> action;

  RunnerBasedOnAction5(Action5<Void, Void, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public void run() {
    action.execute(null, null, null, null, null);
  }

  @Override
  public Action5<Void, Void, Void, Void, Void, Void> wrappedAction() {
    return action;
  }
}
