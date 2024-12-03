package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.general.function.primitive.ObjectAndDoubleToDoubleFunction;

class ObjectAndDoubleToDoubleFunctionAction<D> extends AbstractAction2<Double, D, Double> {
  private final ObjectAndDoubleToDoubleFunction<D> function;

  public ObjectAndDoubleToDoubleFunctionAction(ObjectAndDoubleToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Double data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, double data2) {
    return function.apply(data1, data2);
  }
}
