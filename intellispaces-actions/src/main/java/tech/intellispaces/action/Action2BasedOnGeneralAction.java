package tech.intellispaces.action;

class Action2BasedOnGeneralAction<R, D1, D2> extends AbstractAction2<R, D1, D2> {
  private final Action action;

  Action2BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2) {
    Object[] allData = { data1, data2 };
    return (R) action.execute(allData);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    Object[] allData = { data1, data2 };
    return action.executeReturnInt(allData);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    Object[] allData = { data1, data2 };
    return action.executeReturnDouble(allData);
  }
}
