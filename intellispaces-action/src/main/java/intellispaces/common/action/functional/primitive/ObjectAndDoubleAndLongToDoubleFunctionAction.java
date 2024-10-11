package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndDoubleAndLongToDoubleFunction;

public class ObjectAndDoubleAndLongToDoubleFunctionAction<D>
    extends AbstractAction3<Double, D, Double, Long>
    implements Action3<Double, D, Double, Long>
{
  private final ObjectAndDoubleAndLongToDoubleFunction<D> function;

  public ObjectAndDoubleAndLongToDoubleFunctionAction(ObjectAndDoubleAndLongToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Double data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, double data2, long data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, double data2, long data3) {
    return function.apply(data1, data2, data3);
  }
}
