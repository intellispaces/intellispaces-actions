package intellispaces.common.action.delegate;

import intellispaces.common.action.Action;
import intellispaces.common.action.getter.Getter;

public interface Delegate extends Action {

  Getter<? extends Action> contractor();
}
