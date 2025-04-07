package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction;
import tech.intellispaces.actions.Action;

public abstract class AbstractWrapperAction extends AbstractAction implements WrapperAction {
  private final Action wrappedAction;

  public AbstractWrapperAction(Action wrappedAction) {
    this.wrappedAction = wrappedAction;
  }

  @Override
  public int order() {
    return wrappedAction.order();
  }

  @Override
  public Action wrappedAction() {
    return wrappedAction;
  }
}
