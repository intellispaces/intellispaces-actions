package tech.intellispaces.action.functional;

import tech.intellispaces.action.AbstractAction4;
import tech.intellispaces.entity.function.QuadriFunction;

class FunctionalAction4<R, D1, D2, D3, D4> extends AbstractAction4<R, D1, D2, D3, D4> {
  private final QuadriFunction<D1, D2, D3, D4, R> function;

  FunctionalAction4(QuadriFunction<D1, D2, D3, D4, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return function.apply(data1, data2, data3, data4);
  }
}