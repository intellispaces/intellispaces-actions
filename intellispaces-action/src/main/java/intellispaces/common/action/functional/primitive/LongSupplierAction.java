package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;

import java.util.function.LongSupplier;

public class LongSupplierAction extends AbstractAction0<Long> implements Action0<Long> {
  private final LongSupplier supplier;

  public LongSupplierAction(LongSupplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public Long execute() {
    return supplier.getAsLong();
  }

  @Override
  public long executeReturnLong() {
    return supplier.getAsLong();
  }

  @Override
  public double executeReturnDouble() {
    return supplier.getAsLong();
  }
}
