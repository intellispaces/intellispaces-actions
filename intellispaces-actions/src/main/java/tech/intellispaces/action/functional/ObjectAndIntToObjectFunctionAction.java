package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.entity.function.primitive.ObjectAndIntToObjectFunction;

class ObjectAndIntToObjectFunctionAction<R, D> extends AbstractAction2<R, D, Integer> {
  private final ObjectAndIntToObjectFunction<D, R> function;

  public ObjectAndIntToObjectFunctionAction(ObjectAndIntToObjectFunction<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data1, Integer data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data1, int data2) {
    throw new UnsupportedOperationException();
  }
}
