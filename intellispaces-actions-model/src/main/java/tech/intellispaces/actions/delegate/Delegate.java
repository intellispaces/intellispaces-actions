package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.getter.Getter;

public interface Delegate extends Action {

  Getter<? extends Action> contractor();
}
