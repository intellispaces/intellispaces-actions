package tech.intellispaces.actions;

class Action7BasedOnGeneralAction<R, D1, D2, D3, D4, D5, D6, D7> extends AbstractAction7<R, D1, D2, D3, D4, D5, D6, D7> {
  private final Action action;

  Action7BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7) {
    Object[] inputs = { data1, data2, data3, data4, data5, data6, data7 };
    return (R) action.execute(inputs);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7) {
    Object[] inputs = { data1, data2, data3, data4, data5, data6, data7 };
    return action.executeReturnInt(inputs);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7) {
    Object[] inputs = { data1, data2, data3, data4, data5, data6, data7 };
    return action.executeReturnDouble(inputs);
  }
}
