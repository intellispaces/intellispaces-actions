package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;
import tech.intellispaces.entity.function.primitive.ObjectAndIntToIntFunction;

class ObjectAndIntToIntFunctionAction<D> extends AbstractAction2<Integer, D, Integer> {
  private final ObjectAndIntToIntFunction<D> function;

  public ObjectAndIntToIntFunctionAction(ObjectAndIntToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data1, Integer data2) {
    return function.apply(data1, data2);
  }

  @Override
  public int executeReturnInt(D data1, int data2) {
    return function.apply(data1, data2);
  }

  @Override
  public double executeReturnDouble(D data1, int data2) {
    throw new UnsupportedOperationException();
  }
}
