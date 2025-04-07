package tech.intellispaces.actions;

class Action2BasedOnAction1<R, D> extends AbstractAction2<R, D, Void> {
  private final Action1<R, D> action1;

  Action2BasedOnAction1(Action1<R, D> action1) {
    this.action1 = action1;
  }

  @Override
  public R execute(D data1, Void data2) {
    return action1.execute(data1);
  }

  @Override
  public int executeReturnInt(D data1, Void data2) {
    return action1.executeReturnInt(data1);
  }

  @Override
  public double executeReturnDouble(D data1, Void data2) {
    return action1.executeReturnDouble(data1);
  }
}
