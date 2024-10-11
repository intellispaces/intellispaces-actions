package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToLongFunction;

public class ObjectAndTwoLongsToLongFunctionAction<D>
    extends AbstractAction3<Long, D, Long, Long>
    implements Action3<Long, D, Long, Long>
{
  private final ObjectAndTwoLongsToLongFunction<D> function;

  public ObjectAndTwoLongsToLongFunctionAction(ObjectAndTwoLongsToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data1, Long data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, long data2, long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, long data2, long data3) {
    return function.apply(data1, data2, data3);
  }
}
