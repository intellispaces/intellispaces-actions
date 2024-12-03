package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction3;
import tech.intellispaces.general.function.primitive.ObjectAndIntAndDoubleToIntFunction;

class ObjectAndIntAndDoubleToIntFunctionAction<D> extends AbstractAction3<Integer, D, Integer, Double> {
  private final ObjectAndIntAndDoubleToIntFunction<D> function;

  public ObjectAndIntAndDoubleToIntFunctionAction(ObjectAndIntAndDoubleToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Integer data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }
}
