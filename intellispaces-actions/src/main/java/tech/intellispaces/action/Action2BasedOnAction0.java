package tech.intellispaces.action;

class Action2BasedOnAction0<R> extends AbstractAction2<R, Void, Void> {
  private final Action0<R> action0;

  Action2BasedOnAction0(Action0<R> action0) {
    this.action0 = action0;
  }

  @Override
  public R execute(Void data1, Void data2) {
    return action0.execute();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2) {
    return action0.executeReturnInt();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2) {
    return action0.executeReturnDouble();
  }
}
