package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.function.primitive.ObjectAndTwoLongsToDoubleFunction;

public class ObjectAndTwoLongsToDoubleFunctionAction<D>
    extends AbstractAction3<Double, D, Long, Long>
    implements Action3<Double, D, Long, Long>
{
  private final ObjectAndTwoLongsToDoubleFunction<D> function;

  public ObjectAndTwoLongsToDoubleFunctionAction(ObjectAndTwoLongsToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Long data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D data1, long data2, long data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, long data2, long data3) {
    return function.apply(data1, data2, data3);
  }
}
