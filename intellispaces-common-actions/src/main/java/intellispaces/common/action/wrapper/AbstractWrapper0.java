package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;

public abstract class AbstractWrapper0<R> extends AbstractAction0<R> implements Wrapper0<R> {
  private final Action0<R> wrappedAction;

  public AbstractWrapper0(Action0<R> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action0<R> wrappedAction() {
    return wrappedAction;
  }
}
