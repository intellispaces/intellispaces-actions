package tech.intellispaces.actions.runnable;

import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.WrapperAction0;

class RunnableActionBasedOnAction5 extends AbstractRunnableAction implements WrapperAction0<Void> {
  private final Action5<Void, Void, Void, Void, Void, Void> wrappedAction;

  RunnableActionBasedOnAction5(Action5<Void, Void, Void, Void, Void, Void> wrappedAction) {
    this.wrappedAction = wrappedAction;
  }

  @Override
  public void run() {
    wrappedAction.execute(null, null, null, null, null);
  }

  @Override
  public Action5<Void, Void, Void, Void, Void, Void> wrappedAction() {
    return wrappedAction;
  }
}
