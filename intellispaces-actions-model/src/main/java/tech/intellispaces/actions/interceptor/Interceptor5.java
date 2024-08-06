package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action5;

public interface Interceptor5<R, D1, D2, D3, D4, D5> extends Interceptor, Action5<R, D1, D2, D3, D4, D5> {

  @Override
  Action5<R, D1, D2, D3, D4, D5> interceptedAction();
}
