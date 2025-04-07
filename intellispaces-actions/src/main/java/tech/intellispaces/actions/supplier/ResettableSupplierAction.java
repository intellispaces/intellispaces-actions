package tech.intellispaces.actions.supplier;

public class ResettableSupplierAction<R> extends AbstractSupplierAction<R> {
  private R data;

  public ResettableSupplierAction(R data) {
    this.data = data;
  }

  public void set(R data) {
    this.data = data;
  }

  @Override
  public R get() {
    return data;
  }

  @Override
  public int getInt() {
    return (Integer) data;
  }

  @Override
  public double getDouble() {
    return (Double) data;
  }
}
