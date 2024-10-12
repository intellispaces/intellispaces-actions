package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToObjectFunction;

public class ObjectAndTwoIntsToObjectFunctionAction<R, D>
    extends AbstractAction3<R, D, Integer, Integer>
    implements Action3<R, D, Integer, Integer>
{
  private final ObjectAndTwoIntsToObjectFunction<D, R> function;

  public ObjectAndTwoIntsToObjectFunctionAction(ObjectAndTwoIntsToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Integer data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, int data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }
}
