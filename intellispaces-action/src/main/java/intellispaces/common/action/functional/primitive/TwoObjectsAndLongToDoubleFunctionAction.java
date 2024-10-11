package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToDoubleFunction;

public class TwoObjectsAndLongToDoubleFunctionAction<D1, D2>
    extends AbstractAction3<Double, D1, D2, Long>
    implements Action3<Double, D1, D2, Long>
{
  private final TwoObjectsAndLongToDoubleFunction<D1, D2> function;

  public TwoObjectsAndLongToDoubleFunctionAction(TwoObjectsAndLongToDoubleFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Double execute(D1 data1, D2 data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3) {
    return function.apply(data1, data2, data3);
  }
}
