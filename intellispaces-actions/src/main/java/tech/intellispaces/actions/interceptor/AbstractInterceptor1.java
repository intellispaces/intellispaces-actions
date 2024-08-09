package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.AbstractAction1;
import tech.intellispaces.actions.Action1;

public abstract class AbstractInterceptor1<R, D>
    extends AbstractAction1<R, D>
    implements Interceptor1<R, D>
{
  private Action1<R, D> interceptedAction;

  public AbstractInterceptor1() {
  }

  public AbstractInterceptor1(Action1<R, D> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action1<R, D> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action1<R, D> interceptedAction() {
    return interceptedAction;
  }
}
