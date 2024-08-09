package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;

public abstract class AbstractInterceptor0<R>
    extends AbstractAction0<R>
    implements Interceptor0<R>
{
  private Action0<R> interceptedAction;

  public AbstractInterceptor0() {
  }

  public AbstractInterceptor0(Action0<R> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action0<R> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action0<R> interceptedAction() {
    return interceptedAction;
  }
}
