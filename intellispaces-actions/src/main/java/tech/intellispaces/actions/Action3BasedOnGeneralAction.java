package tech.intellispaces.actions;

class Action3BasedOnGeneralAction<R, D1, D2, D3> extends AbstractAction3<R, D1, D2, D3> {
  private final Action action;

  Action3BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3) {
    Object[] inputs = { data1, data2, data3 };
    return (R) action.execute(inputs);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    Object[] inputs = { data1, data2, data3 };
    return action.executeReturnInt(inputs);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    Object[] inputs = { data1, data2, data3 };
    return action.executeReturnDouble(inputs);
  }
}
