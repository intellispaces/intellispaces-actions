package intellispaces.actions.functional;

import intellispaces.actions.AbstractAction1;
import intellispaces.actions.Action1;

import java.util.function.Function;

class FunctionalAction1<R, D> extends AbstractAction1<R, D> implements Action1<R, D> {
  private final Function<D, R> function;

  FunctionalAction1(Function<D, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D data) {
    return function.apply(data);
  }
}
