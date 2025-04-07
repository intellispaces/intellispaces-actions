package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToDoubleFunction;

class ObjectAndTwoIntsToDoubleFunctionAction<D> extends AbstractAction3<Double, D, Integer, Integer> {
  private final ObjectAndTwoIntsToDoubleFunction<D> function;

  public ObjectAndTwoIntsToDoubleFunctionAction(ObjectAndTwoIntsToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Integer data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, int data2, int data3) {
    return function.apply(data1, data2, data3);
  }
}
