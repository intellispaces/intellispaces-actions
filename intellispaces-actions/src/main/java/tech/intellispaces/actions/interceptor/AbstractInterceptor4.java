package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.AbstractAction4;
import tech.intellispaces.actions.Action4;

public abstract class AbstractInterceptor4<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements Interceptor4<R, D1, D2, D3, D4>
{
  private Action4<R, D1, D2, D3, D4> interceptedAction;

  public AbstractInterceptor4() {
  }

  public AbstractInterceptor4(Action4<R, D1, D2, D3, D4> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action4<R, D1, D2, D3, D4> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action4<R, D1, D2, D3, D4> interceptedAction() {
    return interceptedAction;
  }
}
