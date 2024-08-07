package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public abstract class AbstractInterceptor3<R, D1, D2, D3> implements Interceptor3<R, D1, D2, D3> {
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

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<R, D1, D2, D3, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
