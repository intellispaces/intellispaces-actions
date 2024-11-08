package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.AbstractWrapperAction0;
import intellispaces.common.action.wrapper.WrapperAction0;

class CachedFirstTimeInterceptor0<R> extends AbstractWrapperAction0<R> implements WrapperAction0<R> {
  private boolean first = true;
  private R cachedValue = null;

  CachedFirstTimeInterceptor0(Action0<R> interceptedAction) {
    super(interceptedAction);
  }

  @Override
  public R execute() {
    if (first) {
      cachedValue = this.wrappedAction().execute();
      first = false;
    }
    return cachedValue;
  }
}
