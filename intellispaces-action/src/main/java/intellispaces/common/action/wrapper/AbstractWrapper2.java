package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;

public abstract class AbstractWrapper2<R, D1, D2> extends AbstractAction2<R, D1, D2> implements Wrapper2<R, D1, D2> {
  private final Action2<R, D1, D2> wrappedAction;

  public AbstractWrapper2(Action2<R, D1, D2> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action2<R, D1, D2> wrappedAction() {
    return wrappedAction;
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return wrappedAction.executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2) {
    return wrappedAction.executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2) {
    return wrappedAction.executeReturnInt(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return wrappedAction.executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2) {
    return wrappedAction.executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2) {
    return wrappedAction.executeReturnDouble(data1, data2);
  }
}
