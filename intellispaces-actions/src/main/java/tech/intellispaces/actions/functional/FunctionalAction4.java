package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction4;
import tech.intellispaces.commons.function.Function4;

class FunctionalAction4<R, D1, D2, D3, D4> extends AbstractAction4<R, D1, D2, D3, D4> {
  private final Function4<D1, D2, D3, D4, R> function;

  FunctionalAction4(Function4<D1, D2, D3, D4, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return function.apply(data1, data2, data3, data4);
  }
}
