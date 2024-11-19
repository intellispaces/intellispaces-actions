package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction3;
import tech.intellispaces.entity.function.primitive.ThreeObjectsToDoubleFunction;

class ThreeObjectsToDoubleFunctionAction<D1, D2, D3> extends AbstractAction3<Double, D1, D2, D3> {
  private final ThreeObjectsToDoubleFunction<D1, D2, D3> function;

  public ThreeObjectsToDoubleFunctionAction(ThreeObjectsToDoubleFunction<D1, D2, D3> function) {
    this.function = function;
  }

  @Override
  public Double execute(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }
}
