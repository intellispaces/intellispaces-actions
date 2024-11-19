package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction3;
import tech.intellispaces.entity.function.primitive.TwoObjectsAndDoubleToDoubleFunction;

class TwoObjectsAndDoubleToDoubleFunctionAction<D1, D2> extends AbstractAction3<Double, D1, D2, Double> {
  private final TwoObjectsAndDoubleToDoubleFunction<D1, D2> function;

  public TwoObjectsAndDoubleToDoubleFunctionAction(TwoObjectsAndDoubleToDoubleFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Double execute(D1 data1, D2 data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
