package tech.intellispaces.framework.commons.action.handler;

import tech.intellispaces.framework.commons.action.Action;

public class Handler1Wrapper<D> extends AbstractHandler1<D> {
  private final Action<D, D, Void, Void, Void, Void> action;

  public Handler1Wrapper(Action<D, D, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public void handle(D data) {
    action.execute(data, null, null, null, null);
  }
}
