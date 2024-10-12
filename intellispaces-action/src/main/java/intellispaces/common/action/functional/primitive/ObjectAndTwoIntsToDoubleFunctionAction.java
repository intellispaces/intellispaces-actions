package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToDoubleFunction;

public class ObjectAndTwoIntsToDoubleFunctionAction<D>
    extends AbstractAction3<Double, D, Integer, Integer>
    implements Action3<Double, D, Integer, Integer>
{
  private final ObjectAndTwoIntsToDoubleFunction<D> function;

  public ObjectAndTwoIntsToDoubleFunctionAction(ObjectAndTwoIntsToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Integer data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, int data2, int data3) {
    return function.apply(data1, data2, data3);
  }
}
