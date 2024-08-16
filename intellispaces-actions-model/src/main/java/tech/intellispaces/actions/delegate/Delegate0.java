package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.getter.Getter;

public interface Delegate0<R> extends Action0<R>, Delegate {

  @Override
  Getter<Action0<R>> contractor();
}
