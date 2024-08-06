package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.Action5;

class GetterWrapper<V> extends AbstractGetter<V> {
  private final Action5<V, Void, Void, Void, Void, Void> action;

  GetterWrapper(Action5<V, Void, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public V get() {
    return action.execute(null, null, null, null, null);
  }
}
