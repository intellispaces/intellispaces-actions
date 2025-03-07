package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction3;
import tech.intellispaces.commons.function.primitive.ObjectAndTwoIntsToObjectFunction;

class ObjectAndTwoIntsToObjectFunctionAction<R, D> extends AbstractAction3<R, D, Integer, Integer> {
  private final ObjectAndTwoIntsToObjectFunction<D, R> function;

  public ObjectAndTwoIntsToObjectFunctionAction(ObjectAndTwoIntsToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Integer data2, Integer data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }
}
