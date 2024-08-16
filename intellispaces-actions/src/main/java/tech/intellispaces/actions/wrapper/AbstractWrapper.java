package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction;
import tech.intellispaces.actions.Action;

/**
 * Abstract general interceptor.
 */
public abstract class AbstractWrapper extends AbstractAction implements Wrapper {
  private final Action wrappedAction;

  public AbstractWrapper(Action action) {
    this.wrappedAction = action;
  }

  @Override
  public Action wrappedAction() {
    return wrappedAction;
  }
}
