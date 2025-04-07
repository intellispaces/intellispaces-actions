package tech.intellispaces.actions.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * Provider of supplier actions.
 */
public interface SupplierActions {

  static <R> SupplierAction<R> get(R data) {
    return new ResettableSupplierAction<>(data);
  }

  static <R> SupplierAction<R> get(Supplier<R> supplier) {
    return new SupplierActionBasedSupplier<>(supplier);
  }

  static SupplierAction<Integer> get(IntSupplier supplier) {
    return new IntSupplierAction(supplier);
  }

  static SupplierAction<Double> get(DoubleSupplier supplier) {
    return new DoubleSupplierAction(supplier);
  }
}
