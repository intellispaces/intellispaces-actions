package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.TwoObjectsAndLongToLongFunction;

public class TwoObjectsAndLongToLongFunctionAction<D1, D2>
    extends AbstractAction3<Long, D1, D2, Long>
    implements Action3<Long, D1, D2, Long>
{
  private final TwoObjectsAndLongToLongFunction<D1, D2> function;

  public TwoObjectsAndLongToLongFunctionAction(TwoObjectsAndLongToLongFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Long execute(D1 data1, D2 data2, Long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3) {
    return function.apply(data1, data2, data3);
  }
}
