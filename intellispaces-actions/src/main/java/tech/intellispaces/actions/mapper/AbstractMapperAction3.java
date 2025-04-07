package tech.intellispaces.actions.mapper;

import tech.intellispaces.actions.AbstractAction3;

public abstract class AbstractMapperAction3<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements MapperAction3<R, D1, D2, D3>
{
  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return map(data1, data2, data3);
  }

  @Override
  public R apply(D1 data1, D2 data2, D3 data3) {
    return map(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return mapToInt(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return mapToDouble(data1, data2, data3);
  }
}
