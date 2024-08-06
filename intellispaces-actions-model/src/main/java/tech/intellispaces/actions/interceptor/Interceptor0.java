package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action0;

public interface Interceptor0<R> extends Interceptor, Action0<R> {

  @Override
  Action0<R> interceptedAction();
}
