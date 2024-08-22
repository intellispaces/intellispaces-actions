package intellispaces.actions.delegate;

import intellispaces.actions.AbstractAction0;
import intellispaces.actions.Action0;
import intellispaces.actions.getter.Getter;

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
  public Getter<Action0<R>> contractor() {
    return contractor;
  }
}
