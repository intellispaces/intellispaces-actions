package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction3;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToDoubleFunction;

class ObjectAndTwoDoublesToDoubleFunctionAction<D> extends AbstractAction3<Double, D, Double, Double> {
  private final ObjectAndTwoDoublesToDoubleFunction<D> function;

  public ObjectAndTwoDoublesToDoubleFunctionAction(ObjectAndTwoDoublesToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Double data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, double data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
