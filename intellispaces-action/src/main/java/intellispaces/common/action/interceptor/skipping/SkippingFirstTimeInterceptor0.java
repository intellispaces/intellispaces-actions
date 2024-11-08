package intellispaces.common.action.interceptor.skipping;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.AbstractWrapperAction0;

class SkippingFirstTimeInterceptor0<R> extends AbstractWrapperAction0<R> {
  private boolean first = true;

  SkippingFirstTimeInterceptor0(Action0<R> interceptedAction) {
    super(interceptedAction);
  }

  @Override
  public R execute() {
    R result = null;
    if (!first) {
      result = wrappedAction().execute();
    }
    first = false;
    return result;
  }
}
