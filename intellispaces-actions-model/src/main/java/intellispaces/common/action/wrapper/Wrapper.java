package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action;

public interface Wrapper extends Action {

  Action wrappedAction();
}
