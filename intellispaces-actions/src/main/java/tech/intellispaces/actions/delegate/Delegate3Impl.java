package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.getter.Getter;

class Delegate3Impl<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements Delegate3<R, D1, D2, D3>
{
  private final Getter<Action3<R, D1, D2, D3>> contractor;

  Delegate3Impl(Getter<Action3<R, D1, D2, D3>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return contractor.get().execute(data1, data2, data3);
  }

  @Override
  public Getter<Action3<R, D1, D2, D3>> contractor() {
    return contractor;
  }
}
