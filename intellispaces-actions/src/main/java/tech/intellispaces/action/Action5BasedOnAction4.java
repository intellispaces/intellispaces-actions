package tech.intellispaces.action;

class Action5BasedOnAction4<R, D1, D2, D3, D4> extends AbstractAction5<R, D1, D2, D3, D4, Void> {
  private final Action4<R, D1, D2, D3, D4> action4;

  Action5BasedOnAction4(Action4<R, D1, D2, D3, D4> action4) {
    this.action4 = action4;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, Void data5) {
    return action4.execute(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, Void data5) {
    return action4.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, Void data5) {
    return action4.executeReturnDouble(data1, data2, data3, data4);
  }
}
