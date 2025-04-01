package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction5;
import tech.intellispaces.commons.function.Function5;

class FunctionalAction5<R, D1, D2, D3, D4, D5> extends AbstractAction5<R, D1, D2, D3, D4, D5> {
  private final Function5<D1, D2, D3, D4, D5, R> function;

  FunctionalAction5(Function5<D1, D2, D3, D4, D5, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return function.apply(data1, data2, data3, data4, data5);
  }
}
