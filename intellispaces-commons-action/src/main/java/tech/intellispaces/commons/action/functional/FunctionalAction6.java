package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction6;
import tech.intellispaces.commons.function.Function6;

class FunctionalAction6<R, D1, D2, D3, D4, D5, D6> extends AbstractAction6<R, D1, D2, D3, D4, D5, D6> {
  private final Function6<D1, D2, D3, D4, D5, D6, R> function;

  FunctionalAction6(Function6<D1, D2, D3, D4, D5, D6, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    return function.apply(data1, data2, data3, data4, data5, data6);
  }
}
