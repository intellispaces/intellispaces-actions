package tech.intellispaces.action;

class Action1BasedOnGeneralAction<R, D> extends AbstractAction1<R, D> {
  private final Action action;

  Action1BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D data) {
    Object[] allData = { data };
    return (R) action.execute(allData);
  }

  @Override
  public int executeReturnInt(D data) {
    Object[] allData = { data };
    return action.executeReturnInt(allData);
  }

  @Override
  public double executeReturnDouble(D data) {
    Object[] allData = { data };
    return action.executeReturnDouble(allData);
  }
}
