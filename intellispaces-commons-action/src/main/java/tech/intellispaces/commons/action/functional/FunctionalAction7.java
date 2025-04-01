package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction7;
import tech.intellispaces.commons.function.Function7;

class FunctionalAction7<R, D1, D2, D3, D4, D5, D6, D7> extends AbstractAction7<R, D1, D2, D3, D4, D5, D6, D7> {
  private final Function7<D1, D2, D3, D4, D5, D6, D7, R> function;

  FunctionalAction7(Function7<D1, D2, D3, D4, D5, D6, D7, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7) {
    return function.apply(data1, data2, data3, data4, data5, data6, data7);
  }
}
