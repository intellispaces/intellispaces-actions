package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction1;

import java.util.function.ToIntFunction;

class ObjectToIntFunctionAction<D> extends AbstractAction1<Integer, D> {
  private final ToIntFunction<D> function;

  public ObjectToIntFunctionAction(ToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data) {
    return function.applyAsInt(data);
  }

  @Override
  public int executeReturnInt(D data) {
    return function.applyAsInt(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    throw new UnsupportedOperationException();
  }
}
