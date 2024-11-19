package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction2;

import java.util.function.BiFunction;

class FunctionalAction2<R, D1, D2> extends AbstractAction2<R, D1, D2> {
  private final BiFunction<D1, D2, R> function;

  FunctionalAction2(BiFunction<D1, D2, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2) {
    return function.apply(data1, data2);
  }
}
