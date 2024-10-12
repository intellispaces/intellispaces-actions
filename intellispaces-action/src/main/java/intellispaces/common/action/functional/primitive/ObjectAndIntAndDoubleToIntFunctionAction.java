package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToIntFunction;

public class ObjectAndIntAndDoubleToIntFunctionAction<D>
    extends AbstractAction3<Integer, D, Integer, Double>
    implements Action3<Integer, D, Integer, Double>
{
  private final ObjectAndIntAndDoubleToIntFunction<D> function;

  public ObjectAndIntAndDoubleToIntFunctionAction(ObjectAndIntAndDoubleToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Integer data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, int data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
