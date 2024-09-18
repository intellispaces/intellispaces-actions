package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action0;
import intellispaces.common.action.wrapper.AbstractWrapper0;
import intellispaces.common.action.wrapper.Wrapper0;

class CachedFirstTimeInterceptor0<R> extends AbstractWrapper0<R> implements Wrapper0<R> {
  private boolean first = true;
  private R cachedValue = null;

  CachedFirstTimeInterceptor0(Action0<R> action) {
    super(action);
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
