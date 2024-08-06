package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action4;

public interface Interceptor4<R, D1, D2, D3, D4> extends Interceptor, Action4<R, D1, D2, D3, D4> {

  @Override
  Action4<R, D1, D2, D3, D4> interceptedAction();
}
