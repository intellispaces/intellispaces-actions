package tech.intellispaces.actions.supplier;

import java.util.function.DoubleSupplier;

class DoubleSupplierAction extends AbstractSupplierAction<Double> implements SupplierAction<Double> {
  private final DoubleSupplier supplier;

  public DoubleSupplierAction(DoubleSupplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public Double get() {
    return supplier.getAsDouble();
  }

  @Override
  public int getInt() {
    throw new UnsupportedOperationException();
  }

  @Override
  public double getDouble() {
    return supplier.getAsDouble();
  }
}
