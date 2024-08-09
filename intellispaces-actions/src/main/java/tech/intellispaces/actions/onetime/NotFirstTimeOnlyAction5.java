package tech.intellispaces.actions.onetime;

import tech.intellispaces.actions.AbstractAction5;
import tech.intellispaces.actions.Action5;

class NotFirstTimeOnlyAction5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Action5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> action;
  private boolean first = true;

  NotFirstTimeOnlyAction5(Action5<R, D1, D2, D3, D4, D5> action) {
    this.action = action;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    R result = null;
    if (!first) {
      result = action.execute(data1, data2, data3, data4, data5);
    }
    first = false;
    return result;
  }
}
