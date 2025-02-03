package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction1;

import java.util.Objects;
import java.util.function.IntFunction;

class IntegerToObjectAction<R> extends AbstractAction1<R, Integer> {
  private final IntFunction<R> function;

  IntegerToObjectAction(IntFunction<R> function) {
    this.function = function;
  }

  @Override
  public R execute(Integer data) {
    Objects.requireNonNull(data);
    return function.apply(data);
  }

  @Override
  public R execute(int data) {
    return function.apply(data);
  }
}
