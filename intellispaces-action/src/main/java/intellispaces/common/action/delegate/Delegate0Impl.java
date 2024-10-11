package intellispaces.common.action.delegate;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;
import intellispaces.common.action.getter.Getter;

class Delegate0Impl<R> extends AbstractAction0<R> implements Delegate0<R> {
  private final Getter<Action0<R>> contractor;

  Delegate0Impl(Getter<Action0<R>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute() {
    return contractor.get().execute();
  }

  @Override
  public long executeReturnLong() {
    return contractor.get().executeReturnLong();
  }

  @Override
  public double executeReturnDouble() {
    return contractor.get().executeReturnDouble();
  }

  @Override
  public Getter<Action0<R>> contractor() {
    return contractor;
  }
}
