package tech.intellispaces.actions.interceptor.skipping;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.AbstractWrapper0;

class SkippingFirstTimeInterceptor0<R> extends AbstractWrapper0<R> {
  private boolean first = true;

  SkippingFirstTimeInterceptor0(Action0<R> action) {
    super(action);
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
