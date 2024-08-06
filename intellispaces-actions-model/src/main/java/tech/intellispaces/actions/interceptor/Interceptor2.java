package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action2;

public interface Interceptor2<R, D1, D2> extends Interceptor, Action2<R, D1, D2> {

  @Override
  Action2<R, D1, D2> interceptedAction();
}
