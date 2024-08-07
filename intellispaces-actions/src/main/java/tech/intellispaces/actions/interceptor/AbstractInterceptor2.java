package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public abstract class AbstractInterceptor2<R, D1, D2> implements Interceptor2<R, D1, D2> {
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

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<R, D1, D2, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
