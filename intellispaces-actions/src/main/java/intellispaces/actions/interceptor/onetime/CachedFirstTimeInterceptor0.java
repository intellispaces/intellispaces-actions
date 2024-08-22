package intellispaces.actions.interceptor.onetime;

import intellispaces.actions.wrapper.AbstractWrapper0;
import intellispaces.actions.wrapper.Wrapper0;
import intellispaces.actions.Action0;

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
