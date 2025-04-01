package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.dataadapter.DataAdapterAction;

class Action4ConvertedFromAction5<R, _D1, _D2, _D3, _D4, D1, D2, D3, D4, D5> extends AbstractAction4<R, _D1, _D2, _D3, _D4> {
  private final Action5<R, D1, D2, D3, D4, D5> action5;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;
  private final DataAdapterAction<D3> dataExtractor3;
  private final DataAdapterAction<D4> dataExtractor4;
  private final DataAdapterAction<D5> dataExtractor5;

  Action4ConvertedFromAction5(
      Action5<R, D1, D2, D3, D4, D5> action5,
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5
  ) {
    this.action5 = action5;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
    this.dataExtractor3 = dataExtractor3;
    this.dataExtractor4 = dataExtractor4;
    this.dataExtractor5 = dataExtractor5;
  }

  @Override
  public R execute(_D1 data1, _D2 data2, _D3 data3, _D4 data4) {
    Object[] inputs = { data1, data2, data3, data4 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    return action5.execute(targetData1, targetData2, targetData3, targetData4, targetData5);
  }

  @Override
  public int executeReturnInt(_D1 data1, _D2 data2, _D3 data3, _D4 data4) {
    Object[] inputs = { data1, data2, data3, data4 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    return action5.executeReturnInt(targetData1, targetData2, targetData3, targetData4, targetData5);
  }

  @Override
  public double executeReturnDouble(_D1 data1, _D2 data2, _D3 data3, _D4 data4) {
    Object[] inputs = { data1, data2, data3, data4 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    return action5.executeReturnDouble(targetData1, targetData2, targetData3, targetData4, targetData5);
  }
}
