package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToLongFunction;

public class ObjectAndDoubleAndLongToLongFunctionAction<D>
    extends AbstractAction3<Long, D, Double, Long>
    implements Action3<Long, D, Double, Long>
{
  private final ObjectAndDoubleAndLongToLongFunction<D> function;

  public ObjectAndDoubleAndLongToLongFunctionAction(ObjectAndDoubleAndLongToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data1, Double data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, double data2, long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, double data2, long data3) {
    return function.apply(data1, data2, data3);
  }
}
