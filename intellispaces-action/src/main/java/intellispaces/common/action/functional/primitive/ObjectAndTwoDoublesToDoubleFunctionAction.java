package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToDoubleFunction;

public class ObjectAndTwoDoublesToDoubleFunctionAction<D>
    extends AbstractAction3<Double, D, Double, Double>
    implements Action3<Double, D, Double, Double>
{
  private final ObjectAndTwoDoublesToDoubleFunction<D> function;

  public ObjectAndTwoDoublesToDoubleFunctionAction(ObjectAndTwoDoublesToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Double data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, double data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, double data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
