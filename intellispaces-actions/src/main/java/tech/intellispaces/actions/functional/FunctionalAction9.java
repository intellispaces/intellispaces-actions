package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction9;
import tech.intellispaces.commons.function.Function9;

class FunctionalAction9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> extends AbstractAction9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> {
  private final Function9<D1, D2, D3, D4, D5, D6, D7, D8, D9, R> function;

  FunctionalAction9(Function9<D1, D2, D3, D4, D5, D6, D7, D8, D9, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9) {
    return function.apply(data1, data2, data3, data4, data5, data6, data7, data8, data9);
  }
}
