package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;

class Action3ConvertedFromAction4<R, _D1, _D2, _D3, D1, D2, D3, D4> extends AbstractAction3<R, _D1, _D2, _D3> {
  private final Action4<R, D1, D2, D3, D4> action4;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;
  private final DataAdapterAction<D3> dataExtractor3;
  private final DataAdapterAction<D4> dataExtractor4;

  Action3ConvertedFromAction4(
      Action4<R, D1, D2, D3, D4> action4,
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4
  ) {
    this.action4 = action4;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
    this.dataExtractor3 = dataExtractor3;
    this.dataExtractor4 = dataExtractor4;
  }

  @Override
  public R execute(_D1 data1, _D2 data2, _D3 data3) {
    Object[] inputs = { data1, data2, data3 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    return action4.execute(targetData1, targetData2, targetData3, targetData4);
  }

  @Override
  public int executeReturnInt(_D1 data1, _D2 data2, _D3 data3) {
    Object[] inputs = { data1, data2, data3 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    return action4.executeReturnInt(targetData1, targetData2, targetData3, targetData4);
  }

  @Override
  public double executeReturnDouble(_D1 data1, _D2 data2, _D3 data3) {
    Object[] inputs = { data1, data2, data3 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    return action4.executeReturnDouble(targetData1, targetData2, targetData3, targetData4);
  }
}
