package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.AbstractAction5;
import tech.intellispaces.actions.Action5;

public abstract class AbstractInterceptor5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Interceptor5<R, D1, D2, D3, D4, D5>
{
  private Action5<R, D1, D2, D3, D4, D5> interceptedAction;

  public AbstractInterceptor5() {
  }

  public AbstractInterceptor5(Action5<R, D1, D2, D3, D4, D5> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action5<R, D1, D2, D3, D4, D5> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> interceptedAction() {
    return interceptedAction;
  }
}
