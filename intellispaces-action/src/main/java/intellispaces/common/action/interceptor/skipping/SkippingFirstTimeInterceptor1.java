package intellispaces.common.action.interceptor.skipping;

import intellispaces.common.action.Action1;
import intellispaces.common.action.wrapper.AbstractWrapperAction1;

class SkippingFirstTimeInterceptor1<R, D> extends AbstractWrapperAction1<R, D> {
  private boolean first = true;

  SkippingFirstTimeInterceptor1(Action1<R, D> interceptedAction) {
    super(interceptedAction);
  }

  @Override
  public R execute(D data) {
    R result = null;
    if (!first) {
      result = this.wrappedAction().execute(data);
    }
    first = false;
    return result;
  }
}
