package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.function.primitive.ObjectAndIntToObjectFunction;

public class ObjectAndIntToObjectFunctionAction<R, D>
    extends AbstractAction2<R, D, Integer>
    implements Action2<R, D, Integer>
{
  private final ObjectAndIntToObjectFunction<D, R> function;

  public ObjectAndIntToObjectFunctionAction(ObjectAndIntToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Integer data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, int data2) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, int data2) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }
}
