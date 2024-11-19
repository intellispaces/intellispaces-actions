package tech.intellispaces.action;

import tech.intellispaces.action.dataextractor.DataExtractorAction;

class Action1BasedOnAction4<R, _D, D1, D2, D3, D4> extends AbstractAction1<R, _D> {
  private final Action4<R, D1, D2, D3, D4> action4;
  private final DataExtractorAction<D1> dataExtractor1;
  private final DataExtractorAction<D2> dataExtractor2;
  private final DataExtractorAction<D3> dataExtractor3;
  private final DataExtractorAction<D4> dataExtractor4;

  Action1BasedOnAction4(
      Action4<R, D1, D2, D3, D4> action4,
      DataExtractorAction<D1> dataExtractor1,
      DataExtractorAction<D2> dataExtractor2,
      DataExtractorAction<D3> dataExtractor3,
      DataExtractorAction<D4> dataExtractor4
  ) {
    this.action4 = action4;
    this.dataExtractor1 = dataExtractor1;
    this.dataExtractor2 = dataExtractor2;
    this.dataExtractor3 = dataExtractor3;
    this.dataExtractor4 = dataExtractor4;
  }

  @Override
  public R execute(_D data) {
    Object[] allData = { data };
    D1 targetData1 = dataExtractor1.execute(allData, 0);
    D2 targetData2 = dataExtractor2.execute(allData, 1);
    D3 targetData3 = dataExtractor3.execute(allData, 2);
    D4 targetData4 = dataExtractor4.execute(allData, 3);
    return action4.execute(targetData1, targetData2, targetData3, targetData4);
  }

  @Override
  public int executeReturnInt(_D data) {
    Object[] allData = { data };
    D1 targetData1 = dataExtractor1.execute(allData, 0);
    D2 targetData2 = dataExtractor2.execute(allData, 1);
    D3 targetData3 = dataExtractor3.execute(allData, 2);
    D4 targetData4 = dataExtractor4.execute(allData, 3);
    return action4.executeReturnInt(targetData1, targetData2, targetData3, targetData4);
  }

  @Override
  public double executeReturnDouble(_D data) {
    Object[] allData = { data };
    D1 targetData1 = dataExtractor1.execute(allData, 0);
    D2 targetData2 = dataExtractor2.execute(allData, 1);
    D3 targetData3 = dataExtractor3.execute(allData, 2);
    D4 targetData4 = dataExtractor4.execute(allData, 3);
    return action4.executeReturnDouble(targetData1, targetData2, targetData3, targetData4);
  }
}
