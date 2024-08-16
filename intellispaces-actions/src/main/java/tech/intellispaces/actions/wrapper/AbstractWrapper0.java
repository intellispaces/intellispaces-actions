package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;

public abstract class AbstractWrapper0<R>
    extends AbstractAction0<R>
    implements Wrapper0<R>
{
  private final Action0<R> interceptedAction;

  public AbstractWrapper0(Action0<R> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action0<R> wrappedAction() {
    return interceptedAction;
  }
}