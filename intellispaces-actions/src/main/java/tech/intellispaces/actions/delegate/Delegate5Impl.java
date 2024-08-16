package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.AbstractAction5;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.getter.Getter;

class Delegate5Impl<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Delegate5<R, D1, D2, D3, D4, D5>
{
  private final Getter<Action5<R, D1, D2, D3, D4, D5>> contractor;

  Delegate5Impl(Getter<Action5<R, D1, D2, D3, D4, D5>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return contractor.get().execute(data1, data2, data3, data4, data5);
  }

  @Override
  public Getter<Action5<R, D1, D2, D3, D4, D5>> contractor() {
    return contractor;
  }
}
