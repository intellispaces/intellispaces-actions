package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.function.primitive.ObjectAndIntToIntFunction;

public class ObjectAndIntToIntFunctionAction<D>
    extends AbstractAction2<Integer, D, Integer>
    implements Action2<Integer, D, Integer>
{
  private final ObjectAndIntToIntFunction<D> function;

  public ObjectAndIntToIntFunctionAction(ObjectAndIntToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Integer data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, int data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D data1, int data2) {
    return function.apply(data1, data2);
  }
}
