package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToObjectFunction;

public class TwoObjectsAndLongToObjectFunctionAction<R, D1, D2>
    extends AbstractAction3<R, D1, D2, Long>
    implements Action3<R, D1, D2, Long>
{
  private final TwoObjectsAndLongToObjectFunction<D1, D2, R> function;

  public TwoObjectsAndLongToObjectFunctionAction(TwoObjectsAndLongToObjectFunction<D1, D2, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }
}
