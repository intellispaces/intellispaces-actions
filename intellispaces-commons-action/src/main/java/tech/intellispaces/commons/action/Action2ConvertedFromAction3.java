package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.dataadapter.DataAdapterAction;

class Action2ConvertedFromAction3<R, _D1, _D2, D1, D2, D3> extends AbstractAction2<R, _D1, _D2> {
  private final Action3<R, D1, D2, D3> action3;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;
  private final DataAdapterAction<D3> dataExtractor3;

  Action2ConvertedFromAction3(
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
  public R execute(_D1 data1, _D2 data2) {
    Object[] inputs = { data1, data2 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    return action3.execute(targetData1, targetData2, targetData3);
  }

  @Override
  public int executeReturnInt(_D1 data1, _D2 data2) {
    Object[] inputs = { data1, data2 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    return action3.executeReturnInt(targetData1, targetData2, targetData3);
  }

  @Override
  public double executeReturnDouble(_D1 data1, _D2 data2) {
    Object[] inputs = { data1, data2 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    return action3.executeReturnDouble(targetData1, targetData2, targetData3);
  }
}
