package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public abstract class AbstractInterceptor4<R, D1, D2, D3, D4> implements Interceptor4<R, D1, D2, D3, D4> {
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

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<R, D1, D2, D3, D4, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
