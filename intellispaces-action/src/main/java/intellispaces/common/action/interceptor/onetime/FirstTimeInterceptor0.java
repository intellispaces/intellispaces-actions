package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.AbstractWrapperAction0;
import intellispaces.common.action.wrapper.WrapperAction0;

class FirstTimeInterceptor0<R> extends AbstractWrapperAction0<R> implements WrapperAction0<R> {
  private boolean first = true;

  FirstTimeInterceptor0(Action0<R> interceptedAction) {
    super(interceptedAction);
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
