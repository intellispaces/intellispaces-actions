package intellispaces.actions.delegate;

import intellispaces.actions.Action;
import intellispaces.actions.getter.Getter;

public interface Delegate extends Action {

  Getter<? extends Action> contractor();
}
