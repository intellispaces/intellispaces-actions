package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.entity.function.primitive.ObjectAndIntToDoubleFunction;

class ObjectAndIntToDoubleFunctionAction<D> extends AbstractAction2<Double, D, Integer> {
  private final ObjectAndIntToDoubleFunction<D> function;

  public ObjectAndIntToDoubleFunctionAction(ObjectAndIntToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Integer data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, int data2) {
    return function.apply(data1, data2);
  }
}
