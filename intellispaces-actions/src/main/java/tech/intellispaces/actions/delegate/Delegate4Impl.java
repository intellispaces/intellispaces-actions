package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.AbstractAction4;
import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.getter.Getter;

class Delegate4Impl<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements Delegate4<R, D1, D2, D3, D4>
{
  private final Getter<Action4<R, D1, D2, D3, D4>> contractor;

  Delegate4Impl(Getter<Action4<R, D1, D2, D3, D4>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return contractor.get().execute(data1, data2, data3, data4);
  }

  @Override
  public Getter<Action4<R, D1, D2, D3, D4>> contractor() {
    return contractor;
  }
}
