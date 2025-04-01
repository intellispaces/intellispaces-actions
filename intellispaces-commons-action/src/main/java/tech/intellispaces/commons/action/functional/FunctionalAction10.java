package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction10;
import tech.intellispaces.commons.function.Function10;

class FunctionalAction10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> extends AbstractAction10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> {
  private final Function10<D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, R> function;

  FunctionalAction10(Function10<D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9, D10 dat10) {
    return function.apply(data1, data2, data3, data4, data5, data6, data7, data8, data9, dat10);
  }
}
