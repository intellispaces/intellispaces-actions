package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToObjectFunction;

public class ObjectAndDoubleToObjectFunctionAction<R, D>
    extends AbstractAction2<R, D, Double>
    implements Action2<R, D, Double>
{
  private final ObjectAndDoubleToObjectFunction<D, R> function;

  public ObjectAndDoubleToObjectFunctionAction(ObjectAndDoubleToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, double data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }
}
