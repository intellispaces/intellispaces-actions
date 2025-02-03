package tech.intellispaces.commons.action;

class Action3BasedOnAction0<R> extends AbstractAction3<R, Void, Void, Void> {
  private final Action0<R> action0;

  Action3BasedOnAction0(Action0<R> action0) {
    this.action0 = action0;
  }

  @Override
  public R execute(Void data1, Void data2, Void data3) {
    return action0.execute();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3) {
    return action0.executeReturnInt();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3) {
    return action0.executeReturnDouble();
  }
}
