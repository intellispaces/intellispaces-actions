package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction3;
import tech.intellispaces.commons.base.function.primitive.TwoObjectsAndDoubleToIntFunction;

class TwoObjectsAndDoubleToIntFunctionAction<D1, D2> extends AbstractAction3<Integer, D1, D2, Double> {
  private final TwoObjectsAndDoubleToIntFunction<D1, D2> function;

  public TwoObjectsAndDoubleToIntFunctionAction(TwoObjectsAndDoubleToIntFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D1 data1, D2 data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    throw new UnsupportedOperationException();
  }
}
