package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public abstract class AbstractInterceptor5<R, D1, D2, D3, D4, D5> implements Interceptor5<R, D1, D2, D3, D4, D5> {
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

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<R, D1, D2, D3, D4, D5>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
