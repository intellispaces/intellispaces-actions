package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction2;
import tech.intellispaces.commons.base.function.primitive.ObjectAndDoubleToIntFunction;

class ObjectAndDoubleToIntFunctionAction<D> extends AbstractAction2<Integer, D, Double> {
  private final ObjectAndDoubleToIntFunction<D> function;

  public ObjectAndDoubleToIntFunctionAction(ObjectAndDoubleToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    throw new UnsupportedOperationException();
  }
}
