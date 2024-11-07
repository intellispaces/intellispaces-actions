package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.function.primitive.TwoObjectsToDoubleFunction;

public class TwoObjectsToDoubleFunctionAction<D1, D2>
    extends AbstractAction2<Double, D1, D2>
    implements Action2<Double, D1, D2>
{
  private final TwoObjectsToDoubleFunction<D1, D2> function;

  public TwoObjectsToDoubleFunctionAction(TwoObjectsToDoubleFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Double execute(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }
}
