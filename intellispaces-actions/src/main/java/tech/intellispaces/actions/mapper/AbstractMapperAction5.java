package tech.intellispaces.actions.mapper;

import tech.intellispaces.actions.AbstractAction5;

public abstract class AbstractMapperAction5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements MapperAction5<R, D1, D2, D3, D4, D5>
{
  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return map(data1, data2, data3, data4, data5);
  }

  @Override
  public R apply(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return map(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return mapToInt(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return mapToDouble(data1, data2, data3, data4, data5);
  }
}
