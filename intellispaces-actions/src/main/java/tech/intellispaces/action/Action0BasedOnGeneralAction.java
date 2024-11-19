package tech.intellispaces.action;

class Action0BasedOnGeneralAction<R> extends AbstractAction0<R> {
  private final Action action;

  Action0BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute() {
    Object[] allData = {};
    return (R) action.execute(allData);
  }

  @Override
  public int executeReturnInt() {
    Object[] allData = {};
    return action.executeReturnInt(allData);
  }

  @Override
  public double executeReturnDouble() {
    Object[] allData = {};
    return action.executeReturnDouble(allData);
  }
}
