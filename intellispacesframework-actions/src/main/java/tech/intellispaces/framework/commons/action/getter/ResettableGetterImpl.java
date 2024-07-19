package tech.intellispaces.framework.commons.action.getter;

import tech.intellispaces.framework.commons.action.ResettableGetter;

class ResettableGetterImpl<V> extends AbstractGetter<V> implements ResettableGetter<V> {
  private V value;

  ResettableGetterImpl() {}

  ResettableGetterImpl(V value) {
    this.value = value;
  }

  @Override
  public V get() {
    return value;
  }

  @Override
  public void set(V value) {
    this.value = value;
  }
}
