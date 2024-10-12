package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndIntToDoubleFunction;

public class ObjectAndIntToDoubleFunctionAction<D>
    extends AbstractAction2<Double, D, Integer>
    implements Action2<Double, D, Integer>
{
  private final ObjectAndIntToDoubleFunction<D> function;

  public ObjectAndIntToDoubleFunctionAction(ObjectAndIntToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Integer data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, int data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, int data2) {
    return function.apply(data1, data2);
  }
}
