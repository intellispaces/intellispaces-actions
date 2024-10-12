package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ThreeObjectsToIntFunction;

public class ThreeObjectsToIntFunctionAction<D1, D2, D3>
    extends AbstractAction3<Integer, D1, D2, D3>
    implements Action3<Integer, D1, D2, D3>
{
  private final ThreeObjectsToIntFunction<D1, D2, D3> function;

  public ThreeObjectsToIntFunctionAction(ThreeObjectsToIntFunction<D1, D2, D3> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }
}
