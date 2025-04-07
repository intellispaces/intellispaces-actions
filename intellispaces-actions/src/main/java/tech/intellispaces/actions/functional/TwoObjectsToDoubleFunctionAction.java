package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction2;
import tech.intellispaces.commons.function.primitive.TwoObjectsToDoubleFunction;

class TwoObjectsToDoubleFunctionAction<D1, D2> extends AbstractAction2<Double, D1, D2> {
  private final TwoObjectsToDoubleFunction<D1, D2> function;

  public TwoObjectsToDoubleFunctionAction(TwoObjectsToDoubleFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Double execute(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }
}
