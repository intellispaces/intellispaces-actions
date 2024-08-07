package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action3;

public interface Interceptor3<R, D1, D2, D3> extends Interceptor, Action3<R, D1, D2, D3> {

  @Override
  Action3<R, D1, D2, D3> interceptedAction();

  @Override
  default R execute(D1 data1, D2 data2, D3 data3, Void data4) {
    return execute(data1, data2, data3);
  }
}
