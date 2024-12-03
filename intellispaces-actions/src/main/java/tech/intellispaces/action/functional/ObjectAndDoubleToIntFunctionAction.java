package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.general.function.primitive.ObjectAndDoubleToIntFunction;

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
