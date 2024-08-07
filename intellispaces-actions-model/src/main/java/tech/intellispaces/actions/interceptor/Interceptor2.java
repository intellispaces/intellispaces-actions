package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action2;

public interface Interceptor2<R, D1, D2> extends Interceptor, Action2<R, D1, D2> {

  @Override
  Action2<R, D1, D2> interceptedAction();

  @Override
  default R execute(D1 data1, D2 data2, Void data3) {
    return execute(data1, data2);
  }

  @Override
  default R execute(D1 data1, D2 data2, Void data3, Void data4) {
    return execute(data1, data2);
  }
}
