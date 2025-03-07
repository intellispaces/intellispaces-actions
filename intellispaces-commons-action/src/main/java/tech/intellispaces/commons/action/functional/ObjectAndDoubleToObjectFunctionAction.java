package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction2;
import tech.intellispaces.commons.function.primitive.ObjectAndDoubleToObjectFunction;

class ObjectAndDoubleToObjectFunctionAction<R, D> extends AbstractAction2<R, D, Double> {
  private final ObjectAndDoubleToObjectFunction<D, R> function;

  public ObjectAndDoubleToObjectFunctionAction(ObjectAndDoubleToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    throw new UnsupportedOperationException();
  }
}
