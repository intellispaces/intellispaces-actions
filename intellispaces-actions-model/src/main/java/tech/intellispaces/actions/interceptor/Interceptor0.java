package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action0;

public interface Interceptor0<R> extends Interceptor, Action0<R> {

  @Override
  Action0<R> interceptedAction();

  @Override
  default R execute(Void data) {
    return execute();
  }

  @Override
  default R execute(Void data1, Void data2) {
    return execute();
  }

  @Override
  default R execute(Void data1, Void data2, Void data3) {
    return execute();
  }

  @Override
  default R execute(Void data1, Void data2, Void data3, Void data4) {
    return execute();
  }
}
