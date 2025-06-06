package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;

class Action1ConvertedFromAction2<R, _D, D1, D2> extends AbstractAction1<R, _D> {
  private final Action2<R, D1, D2> action2;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;

  Action1ConvertedFromAction2(
      Action2<R, D1, D2> action2,
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2
  ) {
    this.action2 = action2;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
  }

  @Override
  public R execute(_D data) {
    Object[] inputs = { data };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    return action2.execute(targetData1, targetData2);
  }

  @Override
  public int executeReturnInt(_D data) {
    Object[] inputs = { data };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    return action2.executeReturnInt(targetData1, targetData2);
  }

  @Override
  public double executeReturnDouble(_D data) {
    Object[] inputs = { data };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    return action2.executeReturnDouble(targetData1, targetData2);
  }
}
