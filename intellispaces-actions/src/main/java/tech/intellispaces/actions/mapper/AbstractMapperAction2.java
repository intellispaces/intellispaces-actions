package tech.intellispaces.actions.mapper;

import tech.intellispaces.actions.AbstractAction2;

public abstract class AbstractMapperAction2<R, D1, D2>
    extends AbstractAction2<R, D1, D2>
    implements MapperAction2<R, D1, D2>
{
  @Override
  public R execute(D1 data1, D2 data2) {
    return map(data1, data2);
  }

  @Override
  public R apply(D1 data1, D2 data2) {
    return map(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return mapToInt(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return mapToDouble(data1, data2);
  }
}
