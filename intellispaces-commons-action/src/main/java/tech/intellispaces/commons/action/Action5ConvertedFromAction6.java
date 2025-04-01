package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.dataadapter.DataAdapterAction;

class Action5ConvertedFromAction6<R, _D1, _D2, _D3, _D4, _D5, D1, D2, D3, D4, D5, D6> extends AbstractAction5<R, _D1, _D2, _D3, _D4, _D5> {
  private final Action6<R, D1, D2, D3, D4, D5, D6> action6;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;
  private final DataAdapterAction<D3> dataExtractor3;
  private final DataAdapterAction<D4> dataExtractor4;
  private final DataAdapterAction<D5> dataExtractor5;
  private final DataAdapterAction<D6> dataExtractor6;

  Action5ConvertedFromAction6(
      Action6<R, D1, D2, D3, D4, D5, D6> action6,
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5,
      DataAdapterAction<D6> dataExtractor6
  ) {
    this.action6 = action6;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
    this.dataExtractor3 = dataExtractor3;
    this.dataExtractor4 = dataExtractor4;
    this.dataExtractor5 = dataExtractor5;
    this.dataExtractor6 = dataExtractor6;
  }

  @Override
  public R execute(_D1 data1, _D2 data2, _D3 data3, _D4 data4, _D5 data5) {
    Object[] inputs = { data1, data2, data3, data4, data5 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    D6 targetData6 = dataExtractor6.execute(inputs, 5);
    return action6.execute(targetData1, targetData2, targetData3, targetData4, targetData5, targetData6);
  }

  @Override
  public int executeReturnInt(_D1 data1, _D2 data2, _D3 data3, _D4 data4, _D5 data5) {
    Object[] inputs = { data1, data2, data3, data4, data5 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    D6 targetData6 = dataExtractor6.execute(inputs, 5);
    return action6.executeReturnInt(targetData1, targetData2, targetData3, targetData4, targetData5, targetData6);
  }

  @Override
  public double executeReturnDouble(_D1 data1, _D2 data2, _D3 data3, _D4 data4, _D5 data5) {
    Object[] inputs = { data1, data2, data3, data4, data5 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    D6 targetData6 = dataExtractor6.execute(inputs, 5);
    return action6.executeReturnDouble(targetData1, targetData2, targetData3, targetData4, targetData5, targetData6);
  }
}
