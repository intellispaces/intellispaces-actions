package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.commons.function.Function3;

class FunctionalAction3<R, D1, D2, D3> extends AbstractAction3<R, D1, D2, D3> {
  private final Function3<D1, D2, D3, R> function;

  FunctionalAction3(Function3<D1, D2, D3, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }
}
