package tech.intellispaces.action;

import tech.intellispaces.general.object.Objects;

class Action0BasedOnAction1<R> extends AbstractAction0<R> {
  private final Action1<R, Void> action1;

  Action0BasedOnAction1(Action1<R, Void> action1) {
    this.action1 = action1;
  }

  @Override
  public R execute() {
    return action1.execute(Objects.getVoid());
  }

  @Override
  public int executeReturnInt() {
    return action1.executeReturnInt(Objects.getVoid());
  }

  @Override
  public double executeReturnDouble() {
    return action1.executeReturnDouble(Objects.getVoid());
  }

  @Override
  public Action1<R, Void> convertToAction1() {
    return action1;
  }
}
