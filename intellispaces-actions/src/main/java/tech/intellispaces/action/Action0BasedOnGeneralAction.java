package tech.intellispaces.action;

class Action0BasedOnGeneralAction<R> extends AbstractAction0<R> {
  private final Action action;

  Action0BasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute() {
    Object[] inputs = {};
    return (R) action.execute(inputs);
  }

  @Override
  public int executeReturnInt() {
    Object[] inputs = {};
    return action.executeReturnInt(inputs);
  }

  @Override
  public double executeReturnDouble() {
    Object[] inputs = {};
    return action.executeReturnDouble(inputs);
  }
}
