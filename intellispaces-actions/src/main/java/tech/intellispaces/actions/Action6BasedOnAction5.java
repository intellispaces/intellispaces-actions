package tech.intellispaces.actions;

class Action6BasedOnAction5<R, D1, D2, D3, D4, D5> extends AbstractAction6<R, D1, D2, D3, D4, D5, Void> {
  private final Action5<R, D1, D2, D3, D4, D5> action5;

  Action6BasedOnAction5(Action5<R, D1, D2, D3, D4, D5> action5) {
    this.action5 = action5;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, Void data6) {
    return action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, Void data6a) {
    return action5.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, Void data6) {
    return action5.executeReturnDouble(data1, data2, data3, data4, data5);
  }
}
