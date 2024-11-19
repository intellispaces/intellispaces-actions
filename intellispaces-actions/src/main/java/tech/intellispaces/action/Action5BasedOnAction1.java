package tech.intellispaces.action;

class Action5BasedOnAction1<R, D> extends AbstractAction5<R, D, Void, Void, Void, Void> {
  private final Action1<R, D> action1;

  Action5BasedOnAction1(Action1<R, D> action1) {
    this.action1 = action1;
  }

  @Override
  public R execute(D data1, Void data2, Void data3, Void data4, Void data5) {
    return action1.execute(data1);
  }

  @Override
  public int executeReturnInt(D data1, Void data2, Void data3, Void data4, Void data5) {
    return action1.executeReturnInt(data1);
  }

  @Override
  public double executeReturnDouble(D data1, Void data2, Void data3, Void data4, Void data5) {
    return action1.executeReturnDouble(data1);
  }
}
