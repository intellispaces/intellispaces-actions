package tech.intellispaces.actions.interceptor.skipping;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.wrapper.AbstractWrapper;

class SkippingFirstTimeInterceptor extends AbstractWrapper {
  private boolean first = true;

  SkippingFirstTimeInterceptor(Action action) {
    super(action);
  }

  @Override
  public Object execute(Object... data) {
    Object result = null;
    if (!first) {
      result = wrappedAction().execute(data);
    }
    first = false;
    return result;
  }
}
