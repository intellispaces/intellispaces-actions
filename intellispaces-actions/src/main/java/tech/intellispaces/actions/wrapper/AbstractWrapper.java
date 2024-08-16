package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction;
import tech.intellispaces.actions.Action;

/**
 * Abstract general interceptor.
 */
public abstract class AbstractWrapper extends AbstractAction implements Wrapper {
  private final Action interceptedAction;

  public AbstractWrapper(Action interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action wrappedAction() {
    return interceptedAction;
  }
}
