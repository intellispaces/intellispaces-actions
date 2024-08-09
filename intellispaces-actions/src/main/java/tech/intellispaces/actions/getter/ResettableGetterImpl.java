package tech.intellispaces.actions.getter;

class ResettableGetterImpl<R> extends AbstractGetter<R> implements ResettableGetter<R> {
  private R value;

  ResettableGetterImpl() {}

  ResettableGetterImpl(R value) {
    this.value = value;
  }

  @Override
  public R get() {
    return value;
  }

  @Override
  public void set(R value) {
    this.value = value;
  }
}
