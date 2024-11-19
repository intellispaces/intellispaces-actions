package tech.intellispaces.action;

class Action3BasedOnGeneralAction<R, D1, D2, D3> extends AbstractAction3<R, D1, D2, D3> {
  private final Action action;

  Action3BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3) {
    Object[] allData = { data1, data2, data3 };
    return (R) action.execute(allData);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    Object[] allData = { data1, data2, data3 };
    return action.executeReturnInt(allData);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    Object[] allData = { data1, data2, data3 };
    return action.executeReturnDouble(allData);
  }
}
