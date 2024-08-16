package tech.intellispaces.actions.interceptor.skipping;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.wrapper.AbstractWrapper1;

class SkippingFirstTimeInterceptor1<R, D> extends AbstractWrapper1<R, D> {
  private boolean first = true;

  SkippingFirstTimeInterceptor1(Action1<R, D> action) {
    super(action);
  }

  @Override
  public R execute(D data) {
    R result = null;
    if (!first) {
      result = wrappedAction().execute(data);
    }
    first = false;
    return result;
  }
}
