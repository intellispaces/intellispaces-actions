package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ObjectAndLongAndDoubleToLongFunction;

public class ObjectAndLongAndDoubleToLongFunctionAction<D>
    extends AbstractAction3<Long, D, Long, Double>
    implements Action3<Long, D, Long, Double>
{
  private final ObjectAndLongAndDoubleToLongFunction<D> function;

  public ObjectAndLongAndDoubleToLongFunctionAction(ObjectAndLongAndDoubleToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data1, Long data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, long data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, long data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
