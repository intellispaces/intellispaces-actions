package tech.intellispaces.action.mapper;

import tech.intellispaces.action.AbstractAction1;

public abstract class AbstractMapperAction1<R, D>
    extends AbstractAction1<R, D>
    implements MapperAction1<R, D>
{
  @Override
  public R execute(D data) {
    return map(data);
  }

  @Override
  public R apply(D data) {
    return map(data);
  }

  @Override
  public int executeReturnInt(D data) {
    return mapToInt(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return mapToDouble(data);
  }
}
