package tech.intellispaces.action.supplier;

import tech.intellispaces.general.type.Type;

/**
 * Provider of resettable supplier actions.
 */
public interface ResettableSupplierActions {

  static <R> ResettableSupplierAction<R> get(Type<R> resultType) {
    return new ResettableSupplierAction<>(null);
  }

  static <R> ResettableSupplierAction<R> get(R data) {
    return new ResettableSupplierAction<>(data);
  }
}
