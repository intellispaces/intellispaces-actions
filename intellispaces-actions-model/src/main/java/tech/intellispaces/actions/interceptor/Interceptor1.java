package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action1;

public interface Interceptor1<R, D> extends Interceptor, Action1<R, D> {

  @Override
  Action1<R, D> interceptedAction();

  @Override
  default R execute(D data1, Void data2) {
    return execute(data1);
  }

  @Override
  default R execute(D data1, Void data2, Void data3) {
    return execute(data1);
  }

  @Override
  default R execute(D data1, Void data2, Void data3, Void data4) {
    return execute(data1);
  }
}
