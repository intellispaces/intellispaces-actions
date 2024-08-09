package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.actions.Action3;

public abstract class AbstractInterceptor3<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements Interceptor3<R, D1, D2, D3>
{
  private Action3<R, D1, D2, D3> interceptedAction;

  public AbstractInterceptor3() {
  }

  public AbstractInterceptor3(Action3<R, D1, D2, D3> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action3<R, D1, D2, D3> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action3<R, D1, D2, D3> interceptedAction() {
    return interceptedAction;
  }
}
