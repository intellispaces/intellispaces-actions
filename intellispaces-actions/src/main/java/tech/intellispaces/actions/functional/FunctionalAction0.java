package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;

import java.util.function.Supplier;

class FunctionalAction0<R> extends AbstractAction0<R> implements Action0<R> {
  private final Supplier<R> supplier;

  FunctionalAction0(Supplier<R> supplier) {
    this.supplier = supplier;
  }

  @Override
  public R execute() {
    return supplier.get();
  }
}
