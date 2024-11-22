package tech.intellispaces.action;

import tech.intellispaces.action.dataadapter.DataAdapterAction;

class Action1BasedOnAction3<R, _D, D1, D2, D3> extends AbstractAction1<R, _D> {
  private final Action3<R, D1, D2, D3> action3;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;
  private final DataAdapterAction<D3> dataExtractor3;

  Action1BasedOnAction3(
      Action3<R, D1, D2, D3> action3,
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3
  ) {
    this.action3 = action3;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
    this.dataExtractor3 = dataExtractor3;
  }

  @Override
  public R execute(_D data) {
    Object[] inputs = { data };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    return action3.execute(targetData1, targetData2, targetData3);
  }

  @Override
  public int executeReturnInt(_D data) {
    Object[] inputs = { data };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    return action3.executeReturnInt(targetData1, targetData2, targetData3);
  }

  @Override
  public double executeReturnDouble(_D data) {
    Object[] inputs = { data };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    return action3.executeReturnDouble(targetData1, targetData2, targetData3);
  }
}
