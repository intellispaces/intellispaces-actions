package tech.intellispaces.action;

class Action0BasedOnGeneralAction<R> extends AbstractAction0<R> {
  private final Action action;

  Action0BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute() {
    Object[] inputData = {};
    return (R) action.execute(inputData);
  }

  @Override
  public int executeReturnInt() {
    Object[] inputData = {};
    return action.executeReturnInt(inputData);
  }

  @Override
  public double executeReturnDouble() {
    Object[] inputData = {};
    return action.executeReturnDouble(inputData);
  }
}
