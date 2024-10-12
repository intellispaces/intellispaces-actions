package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.Action1;

public abstract class AbstractWrapper1<R, D> extends AbstractAction1<R, D> implements Wrapper1<R, D> {
  private final Action1<R, D> wrappedAction;

  public AbstractWrapper1(Action1<R, D> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action1<R, D> wrappedAction() {
    return wrappedAction;
  }

  @Override
  public int executeReturnInt(D data) {
    return wrappedAction.executeReturnInt(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return wrappedAction.executeReturnDouble(data);
  }
}
