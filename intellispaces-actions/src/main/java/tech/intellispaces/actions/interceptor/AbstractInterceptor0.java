package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public abstract class AbstractInterceptor0<R> implements Interceptor0<R> {
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

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<R, Void, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
