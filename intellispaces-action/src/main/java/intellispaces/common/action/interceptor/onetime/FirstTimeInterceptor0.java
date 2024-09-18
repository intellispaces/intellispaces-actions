package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.AbstractWrapper0;
import intellispaces.common.action.wrapper.Wrapper0;

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
