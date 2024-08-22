package intellispaces.actions.delegate;

import intellispaces.actions.Action0;
import intellispaces.actions.getter.Getter;

public interface Delegate0<R> extends Action0<R>, Delegate {

  @Override
  Getter<Action0<R>> contractor();
}
