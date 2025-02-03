package tech.intellispaces.commons.action;

class Action6BasedOnAction0<R> extends AbstractAction6<R, Void, Void, Void, Void, Void, Void> {
  private final Action0<R> action0;

  Action6BasedOnAction0(Action0<R> action0) {
    this.action0 = action0;
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, Void data5, Void data6) {
    return action0.execute();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, Void data5, Void data6) {
    return action0.executeReturnInt();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, Void data5, Void data6) {
    return action0.executeReturnDouble();
  }
}
