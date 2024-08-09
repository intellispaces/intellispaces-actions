package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.Action5;

class GetterWrapper<R> extends AbstractGetter<R> {
  private final Action5<R, Void, Void, Void, Void, Void> action;

  GetterWrapper(Action5<R, Void, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public R get() {
    return action.execute(null, null, null, null, null);
  }
}
