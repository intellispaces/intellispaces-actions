package intellispaces.common.action.interceptor.skipping;

import intellispaces.common.action.Action;
import intellispaces.common.action.wrapper.AbstractWrapperAction;

class SkippingFirstTimeInterceptor extends AbstractWrapperAction {
  private boolean first = true;

  SkippingFirstTimeInterceptor(Action interceptedAction) {
    super(interceptedAction);
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
