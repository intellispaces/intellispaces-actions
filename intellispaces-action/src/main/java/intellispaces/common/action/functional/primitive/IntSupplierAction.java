package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;

import java.util.function.IntSupplier;

public class IntSupplierAction extends AbstractAction0<Integer> implements Action0<Integer> {
  private final IntSupplier supplier;

  public IntSupplierAction(IntSupplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public Integer execute() {
    return supplier.getAsInt();
  }

  @Override
  public int executeReturnInt() {
    return supplier.getAsInt();
  }

  @Override
  public double executeReturnDouble() {
    return supplier.getAsInt();
  }
}
