package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action;

public abstract class AbstractInterceptor implements Interceptor {
  private Action interceptedAction;

  public AbstractInterceptor() {
  }

  public AbstractInterceptor(Action interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  public void setInterceptedAction(Action interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action interceptedAction() {
    return interceptedAction;
  }
}
