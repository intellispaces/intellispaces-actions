package tech.intellispaces.action.wrapper;

import tech.intellispaces.action.Action;

public interface WrapperAction extends Action {

  Action wrappedAction();
}
