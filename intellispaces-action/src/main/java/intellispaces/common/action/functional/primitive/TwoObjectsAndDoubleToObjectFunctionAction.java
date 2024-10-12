package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToObjectFunction;

public class TwoObjectsAndDoubleToObjectFunctionAction<R, D1, D2>
    extends AbstractAction3<R, D1, D2, Double>
    implements Action3<R, D1, D2, Double>
{
  private final TwoObjectsAndDoubleToObjectFunction<D1, D2, R> function;

  public TwoObjectsAndDoubleToObjectFunctionAction(TwoObjectsAndDoubleToObjectFunction<D1, D2, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }
}
