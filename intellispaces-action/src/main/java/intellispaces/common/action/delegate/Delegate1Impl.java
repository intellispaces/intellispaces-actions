package intellispaces.common.action.delegate;

import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.Action1;
import intellispaces.common.action.getter.Getter;

class Delegate1Impl<R, D> extends AbstractAction1<R, D> implements Delegate1<R, D> {
  private final Getter<Action1<R, D>> contractor;

  Delegate1Impl(Getter<Action1<R, D>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D data) {
    return contractor.get().execute(data);
  }

  @Override
  public int executeReturnInt(D data) {
    return contractor.get().executeReturnInt(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return contractor.get().executeReturnDouble(data);
  }
  @Override
  public Getter<Action1<R, D>> contractor() {
    return contractor;
  }
}
