package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action1;

public interface Interceptor1<R, D> extends Interceptor, Action1<R, D> {

  @Override
  Action1<R, D> interceptedAction();
}
