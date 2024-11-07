package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToObjectFunction;

public class ObjectAndIntAndDoubleToObjectFunctionAction<R, D>
    extends AbstractAction3<R, D, Integer, Double>
    implements Action3<R, D, Integer, Double>
{
  private final ObjectAndIntAndDoubleToObjectFunction<D, R> function;

  public ObjectAndIntAndDoubleToObjectFunctionAction(ObjectAndIntAndDoubleToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Integer data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, int data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }
}
