package tech.intellispaces.actions.interceptor.onetime;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.AbstractWrapper0;
import tech.intellispaces.actions.wrapper.Wrapper0;

class FirstTimeInterceptor0<R> extends AbstractWrapper0<R> implements Wrapper0<R> {
  private boolean first = true;

  FirstTimeInterceptor0(Action0<R> action) {
    super(action);
  }

  @Override
  public R execute() {
    R result = null;
    if (first) {
      result = this.wrappedAction().execute();
    }
    first = false;
    return result;
  }
}
