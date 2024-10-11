package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;
import intellispaces.common.base.function.primitive.TwoObjectsToLongFunction;

public class TwoObjectsToLongFunctionAction<D1, D2>
    extends AbstractAction2<Long, D1, D2>
    implements Action2<Long, D1, D2>
{
  private final TwoObjectsToLongFunction<D1, D2> function;

  public TwoObjectsToLongFunctionAction(TwoObjectsToLongFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Long execute(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }
}
