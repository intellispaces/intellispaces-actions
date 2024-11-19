package tech.intellispaces.action;

class Action5BasedOnAction3<R, D1, D2, D3> extends AbstractAction5<R, D1, D2, D3, Void, Void> {
  private final Action3<R, D1, D2, D3> action3;

  Action5BasedOnAction3(Action3<R, D1, D2, D3> action3) {
    this.action3 = action3;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return action3.execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, Void data) {
    return action3.executeReturnInt(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, Void data) {
    return action3.executeReturnDouble(data1, data2, data3);
  }
}
