package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action;

public interface Wrapper extends Action {

  Action wrappedAction();
}
