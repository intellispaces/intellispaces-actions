package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndTwoDoublesToObjectFunction;

public class ObjectAndTwoDoublesToObjectFunctionAction<R, D>
    extends AbstractAction3<R, D, Double, Double>
    implements Action3<R, D, Double, Double>
{
  private final ObjectAndTwoDoublesToObjectFunction<D, R> function;

  public ObjectAndTwoDoublesToObjectFunctionAction(ObjectAndTwoDoublesToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Double data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, double data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, double data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }
}
