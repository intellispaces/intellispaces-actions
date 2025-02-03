package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction3;
import tech.intellispaces.commons.base.function.primitive.ObjectAndTwoDoublesToObjectFunction;

class ObjectAndTwoDoublesToObjectFunctionAction<R, D> extends AbstractAction3<R, D, Double, Double> {
  private final ObjectAndTwoDoublesToObjectFunction<D, R> function;

  public ObjectAndTwoDoublesToObjectFunctionAction(ObjectAndTwoDoublesToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Double data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }
}
