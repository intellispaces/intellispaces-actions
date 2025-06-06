package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.commons.function.primitive.ThreeObjectsToIntFunction;

class ThreeObjectsToIntFunctionAction<D1, D2, D3> extends AbstractAction3<Integer, D1, D2, D3> {
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
    throw new UnsupportedOperationException();
  }
}
