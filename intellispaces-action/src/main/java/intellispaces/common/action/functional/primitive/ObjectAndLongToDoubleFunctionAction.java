package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndLongToDoubleFunction;

public class ObjectAndLongToDoubleFunctionAction<D>
    extends AbstractAction2<Double, D, Long>
    implements Action2<Double, D, Long>
{
  private final ObjectAndLongToDoubleFunction<D> function;

  public ObjectAndLongToDoubleFunctionAction(ObjectAndLongToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Long data2) {
    return function.apply(data1, data2);
  }

  @Override
  public long executeReturnLong(D data1, long data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, long data2) {
    return function.apply(data1, data2);
  }
}
