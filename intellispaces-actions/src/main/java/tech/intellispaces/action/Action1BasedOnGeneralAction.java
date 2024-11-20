package tech.intellispaces.action;

class Action1BasedOnGeneralAction<R, D> extends AbstractAction1<R, D> {
  private final Action action;

  Action1BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D data) {
    Object[] inputData = { data };
    return (R) action.execute(inputData);
  }

  @Override
  public int executeReturnInt(D data) {
    Object[] inputData = { data };
    return action.executeReturnInt(inputData);
  }

  @Override
  public double executeReturnDouble(D data) {
    Object[] inputData = { data };
    return action.executeReturnDouble(inputData);
  }
}
