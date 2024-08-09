package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.AbstractAction2;
import tech.intellispaces.actions.Action2;

public abstract class AbstractInterceptor2<R, D1, D2>
    extends AbstractAction2<R, D1, D2>
    implements Interceptor2<R, D1, D2>
{
  private Action2<R, D1, D2> interceptedAction;

  public AbstractInterceptor2() {
  }

  public AbstractInterceptor2(Action2<R, D1, D2> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action2<R, D1, D2> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action2<R, D1, D2> interceptedAction() {
    return interceptedAction;
  }
}
