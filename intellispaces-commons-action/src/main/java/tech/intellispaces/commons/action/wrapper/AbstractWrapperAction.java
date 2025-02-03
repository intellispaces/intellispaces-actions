package tech.intellispaces.commons.action.wrapper;

import tech.intellispaces.commons.action.AbstractAction;
import tech.intellispaces.commons.action.Action;

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
