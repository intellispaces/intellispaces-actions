package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action5;
import intellispaces.common.action.wrapper.AbstractWrapper5;
import intellispaces.common.action.wrapper.Wrapper5;

class CachedFirstTimeInterceptor5<R, D1, D2, D3, D4, D5>
    extends AbstractWrapper5<R, D1, D2, D3, D4, D5>
    implements Wrapper5<R, D1, D2, D3, D4, D5>
{
  private boolean first = true;
  private R cachedValue = null;

  CachedFirstTimeInterceptor5(Action5<R, D1, D2, D3, D4, D5> action) {
    super(action);
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    if (first) {
      cachedValue = this.wrappedAction().execute(data1, data2, data3, data4, data5);
      first = false;
    }
    return cachedValue;
  }
}
