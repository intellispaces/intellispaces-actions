package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.function.primitive.ObjectAndLongToLongFunction;

public class ObjectAndLongToLongFunctionAction<D>
    extends AbstractAction2<Long, D, Long>
    implements Action2<Long, D, Long>
{
  private final ObjectAndLongToLongFunction<D> function;

  public ObjectAndLongToLongFunctionAction(ObjectAndLongToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data1, Long data2) {
    return function.apply(data1, data2);
  }

  @Override
  public long executeReturnLong(D data1, long data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D data1, long data2) {
    return function.apply(data1, data2);
  }
}
