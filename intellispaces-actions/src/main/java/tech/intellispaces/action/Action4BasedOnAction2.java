package tech.intellispaces.action;

class Action4BasedOnAction2<R, D1, D2> extends AbstractAction4<R, D1, D2, Void, Void> {
  private final Action2<R, D1, D2> action2;

  Action4BasedOnAction2(Action2<R, D1, D2> action2) {
    this.action2 = action2;
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4) {
    return action2.execute(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4) {
    return action2.executeReturnInt(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4) {
    return action2.executeReturnDouble(data1, data2);
  }
}
