package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action5;
import intellispaces.common.action.wrapper.AbstractWrapperAction5;
import intellispaces.common.action.wrapper.WrapperAction5;

class FirstTimeInterceptor5<R, D1, D2, D3, D4, D5>
    extends AbstractWrapperAction5<R, D1, D2, D3, D4, D5>
    implements WrapperAction5<R, D1, D2, D3, D4, D5>
{
  private boolean first = true;

  FirstTimeInterceptor5(Action5<R, D1, D2, D3, D4, D5> interceptedAction) {
    super(interceptedAction);
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
