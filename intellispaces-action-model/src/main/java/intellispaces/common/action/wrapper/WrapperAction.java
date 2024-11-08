package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action;

public interface WrapperAction extends Action {

  Action wrappedAction();
}
