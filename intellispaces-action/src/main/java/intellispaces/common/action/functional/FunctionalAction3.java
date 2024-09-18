package intellispaces.common.action.functional;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.TriFunction;

class FunctionalAction3<R, D1, D2, D3> extends AbstractAction3<R, D1, D2, D3> implements Action3<R, D1, D2, D3> {
  private final TriFunction<D1, D2, D3, R> function;

  FunctionalAction3(TriFunction<D1, D2, D3, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return function.apply(data1, data2, data3);
  }
}
