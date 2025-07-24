package tech.intellispaces.actions;

import tech.intellispaces.commons.instance.Instances;

class Action0BasedOnAction1<R> extends AbstractAction0<R> {
  private final Action1<R, Void> action1;

  Action0BasedOnAction1(Action1<R, Void> action1) {
    this.action1 = action1;
  }

  @Override
  public R execute() {
    return action1.execute(Instances.getVoid());
  }

  @Override
  public int executeReturnInt() {
    return action1.executeReturnInt(Instances.getVoid());
  }

  @Override
  public double executeReturnDouble() {
    return action1.executeReturnDouble(Instances.getVoid());
  }

  @Override
  public Action1<R, Void> convertToAction1() {
    return action1;
  }
}
