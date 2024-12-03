package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.general.function.primitive.TwoObjectsToIntFunction;

class TwoObjectsToIntFunctionAction<D1, D2> extends AbstractAction2<Integer, D1, D2> {
  private final TwoObjectsToIntFunction<D1, D2> function;

  public TwoObjectsToIntFunctionAction(TwoObjectsToIntFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    throw new UnsupportedOperationException();
  }
}
