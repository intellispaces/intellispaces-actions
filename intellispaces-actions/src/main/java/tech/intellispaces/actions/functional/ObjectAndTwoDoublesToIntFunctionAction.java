package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoDoublesToIntFunction;

class ObjectAndTwoDoublesToIntFunctionAction<D> extends AbstractAction3<Integer, D, Double, Double> {
  private final ObjectAndTwoDoublesToIntFunction<D> function;

  public ObjectAndTwoDoublesToIntFunctionAction(ObjectAndTwoDoublesToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Double data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, double data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }
}
