package intellispaces.common.action.getter;

class ResettableGetterImpl<R> extends AbstractGetter<R> implements ResettableGetter<R> {
  private R value;

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
