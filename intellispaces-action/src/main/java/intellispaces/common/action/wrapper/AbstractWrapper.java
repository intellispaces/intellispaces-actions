package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction;
import intellispaces.common.action.Action;

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

  @Override
  public int actionOrder() {
    return wrappedAction.actionOrder();
  }
}
