package tech.intellispaces.action.supplier;

import java.util.function.Supplier;

class SupplierActionBasedSupplier<R> extends AbstractSupplierAction<R> implements SupplierAction<R> {
  private final Supplier<R> supplier;

  SupplierActionBasedSupplier(Supplier<R> supplier) {
    this.supplier = supplier;
  }

  @Override
  public R get() {
    return supplier.get();
  }

  @Override
  public int getInt() {
    return (Integer) supplier.get();
  }

  @Override
  public double getDouble() {
    return (Double) supplier.get();
  }
}
