package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndIntToIntFunction;

class TwoObjectsAndIntToIntFunctionAction<D1, D2> extends AbstractAction3<Integer, D1, D2, Integer> {
  private final TwoObjectsAndIntToIntFunction<D1, D2> function;

  public TwoObjectsAndIntToIntFunctionAction(TwoObjectsAndIntToIntFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D1 data1, D2 data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    throw new UnsupportedOperationException();
  }
}
