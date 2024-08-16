package tech.intellispaces.actions.interceptor.onetime;

import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.AbstractWrapper5;
import tech.intellispaces.actions.wrapper.Wrapper5;

class FirstTimeInterceptor5<R, D1, D2, D3, D4, D5>
    extends AbstractWrapper5<R, D1, D2, D3, D4, D5>
    implements Wrapper5<R, D1, D2, D3, D4, D5>
{
  private boolean first = true;

  FirstTimeInterceptor5(Action5<R, D1, D2, D3, D4, D5> action) {
    super(action);
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    R result = null;
    if (first) {
      result = this.wrappedAction().execute(data1, data2, data3, data4, data5);
    }
    first = false;
    return result;
  }
}
