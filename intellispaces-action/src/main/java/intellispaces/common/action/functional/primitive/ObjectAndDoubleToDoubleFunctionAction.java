package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToDoubleFunction;

public class ObjectAndDoubleToDoubleFunctionAction<D>
    extends AbstractAction2<Double, D, Double>
    implements Action2<Double, D, Double>
{
  private final ObjectAndDoubleToDoubleFunction<D> function;

  public ObjectAndDoubleToDoubleFunctionAction(ObjectAndDoubleToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public long executeReturnLong(D data1, double data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    return function.apply(data1, data2);
  }
}
