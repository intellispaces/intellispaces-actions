package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.function.primitive.ObjectAndDoubleToIntFunction;

public class ObjectAndDoubleToIntFunctionAction<D>
    extends AbstractAction2<Integer, D, Double>
    implements Action2<Integer, D, Double>
{
  private final ObjectAndDoubleToIntFunction<D> function;

  public ObjectAndDoubleToIntFunctionAction(ObjectAndDoubleToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    return function.apply(data1, data2);
  }
}
