package tech.intellispaces.commons.action;

class Action1BasedOnAction0<R> extends AbstractAction1<R, Void> {
  private final Action0<R> action0;

  Action1BasedOnAction0(Action0<R> action0) {
    this.action0 = action0;
  }

  @Override
  public R execute(Void data) {
    return action0.execute();
  }

  @Override
  public int executeReturnInt(Void data) {
    return action0.executeReturnInt();
  }

  @Override
  public double executeReturnDouble(Void data) {
    return action0.executeReturnDouble();
  }
}
