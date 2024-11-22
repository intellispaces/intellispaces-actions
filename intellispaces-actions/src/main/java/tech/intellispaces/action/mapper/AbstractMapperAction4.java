package tech.intellispaces.action.mapper;

import tech.intellispaces.action.AbstractAction4;

public abstract class AbstractMapperAction4<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements MapperAction4<R, D1, D2, D3, D4>
{
  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return map(data1, data2, data3, data4);
  }

  @Override
  public R apply(D1 data1, D2 data2, D3 data3, D4 data4) {
    return map(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    return mapToInt(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    return mapToDouble(data1, data2, data3, data4);
  }
}
