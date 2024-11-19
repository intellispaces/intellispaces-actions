package tech.intellispaces.action.supplier;

import java.util.function.IntSupplier;

class IntSupplierAction extends AbstractSupplierAction<Integer> implements SupplierAction<Integer> {
  private final IntSupplier supplier;

  public IntSupplierAction(IntSupplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public Integer get() {
    return supplier.getAsInt();
  }

  @Override
  public int getInt() {
    return supplier.getAsInt();
  }

  @Override
  public double getDouble() {
    throw new UnsupportedOperationException();
  }
}
