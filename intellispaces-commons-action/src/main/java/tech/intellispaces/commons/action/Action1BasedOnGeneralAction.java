package tech.intellispaces.commons.action;

class Action1BasedOnGeneralAction<R, D> extends AbstractAction1<R, D> {
  private final Action action;

  Action1BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D data) {
    Object[] inputs = { data };
    return (R) action.execute(inputs);
  }

  @Override
  public int executeReturnInt(D data) {
    Object[] inputs = { data };
    return action.executeReturnInt(inputs);
  }

  @Override
  public double executeReturnDouble(D data) {
    Object[] inputs = { data };
    return action.executeReturnDouble(inputs);
  }
}
