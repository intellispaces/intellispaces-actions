package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToLongFunction;
import intellispaces.common.base.function.primitive.ObjectAndLongToLongFunction;

public class ObjectAndDoubleToLongFunctionAction<D>
    extends AbstractAction2<Long, D, Double>
    implements Action2<Long, D, Double>
{
  private final ObjectAndDoubleToLongFunction<D> function;

  public ObjectAndDoubleToLongFunctionAction(ObjectAndDoubleToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public long executeReturnLong(D data1, double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    return function.apply(data1, data2);
  }
}
