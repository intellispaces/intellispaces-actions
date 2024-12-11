package tech.intellispaces.action;

import tech.intellispaces.action.dataadapter.DataAdapterAction;

class Action0ConvertedFromAction1<R, D> extends AbstractAction0<R> {
  private final Action1<R, D> action1;
  private final DataAdapterAction<D> dataExtractor;

  Action0ConvertedFromAction1(
      Action1<R, D> action1, DataAdapterAction<D> dataExtractor
  ) {
    this.action1 = action1;
    this.dataExtractor = dataExtractor;
  }

  @Override
  public R execute() {
    Object[] inputs = {};
    D targetData = dataExtractor.execute(inputs, 0);
    return action1.execute(targetData);
  }

  @Override
  public int executeReturnInt() {
    Object[] inputs = {};
    D targetData = dataExtractor.execute(inputs, 0);
    return action1.executeReturnInt(targetData);
  }

  @Override
  public double executeReturnDouble() {
    Object[] inputs = {};
    D targetData = dataExtractor.execute(inputs, 0);
    return action1.executeReturnDouble(targetData);
  }
}
