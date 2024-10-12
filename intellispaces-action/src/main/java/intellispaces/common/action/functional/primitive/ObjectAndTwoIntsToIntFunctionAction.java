package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ObjectAndTwoIntsToIntFunction;

public class ObjectAndTwoIntsToIntFunctionAction<D>
    extends AbstractAction3<Integer, D, Integer, Integer>
    implements Action3<Integer, D, Integer, Integer>
{
  private final ObjectAndTwoIntsToIntFunction<D> function;

  public ObjectAndTwoIntsToIntFunctionAction(ObjectAndTwoIntsToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Integer data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, int data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, int data2, int data3) {
    return function.apply(data1, data2, data3);
  }
}
