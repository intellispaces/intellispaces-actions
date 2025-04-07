package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;

class Action6ConvertedFromAction7<R, _D1, _D2, _D3, _D4, _D5, _D6, D1, D2, D3, D4, D5, D6, D7> extends AbstractAction6<R, _D1, _D2, _D3, _D4, _D5, _D6> {
  private final Action7<R, D1, D2, D3, D4, D5, D6, D7> action7;
  private final DataAdapterAction<D1> dataExtractor1;
  private final DataAdapterAction<D2> dataExtractor2;
  private final DataAdapterAction<D3> dataExtractor3;
  private final DataAdapterAction<D4> dataExtractor4;
  private final DataAdapterAction<D5> dataExtractor5;
  private final DataAdapterAction<D6> dataExtractor6;
  private final DataAdapterAction<D7> dataExtractor7;

  Action6ConvertedFromAction7(
      Action7<R, D1, D2, D3, D4, D5, D6, D7> action7,
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5,
      DataAdapterAction<D6> dataExtractor6,
      DataAdapterAction<D7> dataExtractor7
  ) {
    this.action7 = action7;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
    this.dataExtractor3 = dataExtractor3;
    this.dataExtractor4 = dataExtractor4;
    this.dataExtractor5 = dataExtractor5;
    this.dataExtractor6 = dataExtractor6;
    this.dataExtractor7 = dataExtractor7;
  }

  @Override
  public R execute(_D1 data1, _D2 data2, _D3 data3, _D4 data4, _D5 data5, _D6 data6) {
    Object[] inputs = { data1, data2, data3, data4, data5, data6 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    D6 targetData6 = dataExtractor6.execute(inputs, 5);
    D7 targetData7 = dataExtractor7.execute(inputs, 6);
    return action7.execute(targetData1, targetData2, targetData3, targetData4, targetData5, targetData6, targetData7);
  }

  @Override
  public int executeReturnInt(_D1 data1, _D2 data2, _D3 data3, _D4 data4, _D5 data5, _D6 data6) {
    Object[] inputs = { data1, data2, data3, data4, data5, data6 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    D6 targetData6 = dataExtractor6.execute(inputs, 5);
    D7 targetData7 = dataExtractor7.execute(inputs, 6);
    return action7.executeReturnInt(targetData1, targetData2, targetData3, targetData4, targetData5, targetData6, targetData7);
  }

  @Override
  public double executeReturnDouble(_D1 data1, _D2 data2, _D3 data3, _D4 data4, _D5 data5, _D6 data6) {
    Object[] inputs = { data1, data2, data3, data4, data5, data6 };
    D1 targetData1 = dataExtractor1.execute(inputs, 0);
    D2 targetData2 = dataExtractor2.execute(inputs, 1);
    D3 targetData3 = dataExtractor3.execute(inputs, 2);
    D4 targetData4 = dataExtractor4.execute(inputs, 3);
    D5 targetData5 = dataExtractor5.execute(inputs, 4);
    D6 targetData6 = dataExtractor6.execute(inputs, 5);
    D7 targetData7 = dataExtractor7.execute(inputs, 6);
    return action7.executeReturnDouble(targetData1, targetData2, targetData3, targetData4, targetData5, targetData6, targetData7);
  }
}
