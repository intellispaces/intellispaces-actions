package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;

public abstract class AbstractWrapperAction0<R> extends AbstractAction0<R> implements WrapperAction0<R> {
  private final Action0<R> wrappedAction;

  public AbstractWrapperAction0(Action0<R> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action0<R> wrappedAction() {
    return wrappedAction;
  }

  @Override
  public int executeReturnInt() {
    return wrappedAction.executeReturnInt();
  }

  @Override
  public double executeReturnDouble() {
    return wrappedAction.executeReturnDouble();
  }
}
