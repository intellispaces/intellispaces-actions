package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToDoubleFunction;

public class TwoObjectsAndDoubleToDoubleFunctionAction<D1, D2>
    extends AbstractAction3<Double, D1, D2, Double>
    implements Action3<Double, D1, D2, Double>
{
  private final TwoObjectsAndDoubleToDoubleFunction<D1, D2> function;

  public TwoObjectsAndDoubleToDoubleFunctionAction(TwoObjectsAndDoubleToDoubleFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Double execute(D1 data1, D2 data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
