package tech.intellispaces.actions.interceptor;

import tech.intellispaces.actions.Action;

public interface Interceptor extends Action {

  Action interceptedAction();
}
