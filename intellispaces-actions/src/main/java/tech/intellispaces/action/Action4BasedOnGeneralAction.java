package tech.intellispaces.action;

class Action4BasedOnGeneralAction<R, D1, D2, D3, D4> extends AbstractAction4<R, D1, D2, D3, D4> {
  private final Action action;

  Action4BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    Object[] inputs = { data1, data2, data3, data4 };
    return (R) action.execute(inputs);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    Object[] inputs = { data1, data2, data3, data4 };
    return action.executeReturnInt(inputs);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    Object[] inputs = { data1, data2, data3, data4 };
    return action.executeReturnDouble(inputs);
  }
}
