package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public abstract class AbstractInterceptor1<R, D> implements Interceptor1<R, D> {
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

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<R, D, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
