package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToLongFunction;

public class ObjectAndTwoDoublesToLongFunctionAction<D>
    extends AbstractAction3<Long, D, Double, Double>
    implements Action3<Long, D, Double, Double>
{
  private final ObjectAndTwoDoublesToLongFunction<D> function;

  public ObjectAndTwoDoublesToLongFunctionAction(ObjectAndTwoDoublesToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data1, Double data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, double data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, double data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
