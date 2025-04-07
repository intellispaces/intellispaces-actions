package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction8;
import tech.intellispaces.commons.function.Function8;

class FunctionalAction8<R, D1, D2, D3, D4, D5, D6, D7, D8> extends AbstractAction8<R, D1, D2, D3, D4, D5, D6, D7, D8> {
  private final Function8<D1, D2, D3, D4, D5, D6, D7, D8, R> function;

  FunctionalAction8(Function8<D1, D2, D3, D4, D5, D6, D7, D8, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8) {
    return function.apply(data1, data2, data3, data4, data5, data6, data7, data8);
  }
}
