package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.Getter;

import java.util.function.Supplier;

class SupplierBasedGetter<V> extends AbstractGetter<V> implements Getter<V> {
  private final Supplier<V> supplier;

  SupplierBasedGetter(Supplier<V> supplier) {
    this.supplier = supplier;
  }

  @Override
  public V get() {
    return supplier.get();
  }
}
