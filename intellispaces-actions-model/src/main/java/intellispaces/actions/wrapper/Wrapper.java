package intellispaces.actions.wrapper;

import intellispaces.actions.Action;

public interface Wrapper extends Action {

  Action wrappedAction();
}
