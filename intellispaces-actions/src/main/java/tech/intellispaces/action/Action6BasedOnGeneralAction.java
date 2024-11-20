package tech.intellispaces.action;

class Action6BasedOnGeneralAction<R, D1, D2, D3, D4, D5, D6> extends AbstractAction6<R, D1, D2, D3, D4, D5, D6> {
  private final Action action;

  Action6BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    Object[] inputData = { data1, data2, data3, data4, data5, data6 };
    return (R) action.execute(inputData);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    Object[] inputData = { data1, data2, data3, data4, data5, data6 };
    return action.executeReturnInt(inputData);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    Object[] inputData = { data1, data2, data3, data4, data5, data6 };
    return action.executeReturnDouble(inputData);
  }
}
