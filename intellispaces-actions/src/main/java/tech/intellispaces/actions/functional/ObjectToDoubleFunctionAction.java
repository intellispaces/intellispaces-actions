package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction1;

import java.util.function.ToDoubleFunction;

class ObjectToDoubleFunctionAction<D> extends AbstractAction1<Double, D> {
  private final ToDoubleFunction<D> function;

  public ObjectToDoubleFunctionAction(ToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data) {
    return function.applyAsDouble(data);
  }

  @Override
  public int executeReturnInt(D data) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data) {
    return function.applyAsDouble(data);
  }
}
