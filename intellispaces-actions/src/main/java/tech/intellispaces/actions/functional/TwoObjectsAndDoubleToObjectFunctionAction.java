package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.commons.function.primitive.TwoObjectsAndDoubleToObjectFunction;

class TwoObjectsAndDoubleToObjectFunctionAction<R, D1, D2> extends AbstractAction3<R, D1, D2, Double> {
  private final TwoObjectsAndDoubleToObjectFunction<D1, D2, R> function;

  public TwoObjectsAndDoubleToObjectFunctionAction(TwoObjectsAndDoubleToObjectFunction<D1, D2, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    throw new UnsupportedOperationException();
  }
}
