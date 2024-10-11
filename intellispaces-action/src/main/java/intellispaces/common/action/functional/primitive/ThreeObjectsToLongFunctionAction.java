package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.ThreeObjectsToLongFunction;

public class ThreeObjectsToLongFunctionAction<D1, D2, D3>
    extends AbstractAction3<Long, D1, D2, D3>
    implements Action3<Long, D1, D2, D3>
{
  private final ThreeObjectsToLongFunction<D1, D2, D3> function;

  public ThreeObjectsToLongFunctionAction(ThreeObjectsToLongFunction<D1, D2, D3> function) {
    this.function = function;
  }

  @Override
  public Long execute(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }
}
