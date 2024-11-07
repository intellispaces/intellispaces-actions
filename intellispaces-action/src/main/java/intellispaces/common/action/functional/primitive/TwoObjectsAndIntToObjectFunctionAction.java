package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.function.primitive.TwoObjectsAndIntToObjectFunction;

public class TwoObjectsAndIntToObjectFunctionAction<R, D1, D2>
    extends AbstractAction3<R, D1, D2, Integer>
    implements Action3<R, D1, D2, Integer>
{
  private final TwoObjectsAndIntToObjectFunction<D1, D2, R> function;

  public TwoObjectsAndIntToObjectFunctionAction(TwoObjectsAndIntToObjectFunction<D1, D2, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }
}
