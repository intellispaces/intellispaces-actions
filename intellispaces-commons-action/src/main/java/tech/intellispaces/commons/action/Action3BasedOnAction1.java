package tech.intellispaces.commons.action;

class Action3BasedOnAction1<R, D> extends AbstractAction3<R, D, Void, Void> {
  private final Action1<R, D> action1;

  Action3BasedOnAction1(Action1<R, D> action1) {
    this.action1 = action1;
  }

  @Override
  public R execute(D data1, Void data2, Void data3) {
    return action1.execute(data1);
  }

  @Override
  public int executeReturnInt(D data1, Void data2, Void data3) {
    return action1.executeReturnInt(data1);
  }

  @Override
  public double executeReturnDouble(D data1, Void data2, Void data3) {
    return action1.executeReturnDouble(data1);
  }
}
