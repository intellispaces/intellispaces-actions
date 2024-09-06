package intellispaces.common.action.interceptor.skipping;

import intellispaces.common.action.Action;
import intellispaces.common.action.wrapper.AbstractWrapper;

class SkippingFirstTimeInterceptor extends AbstractWrapper {
  private boolean first = true;

  SkippingFirstTimeInterceptor(Action action) {
    super(action);
  }

  @Override
  public Object execute(Object[] data) {
    Object result = null;
    if (!first) {
      result = wrappedAction().execute(data);
    }
    first = false;
    return result;
  }
}
