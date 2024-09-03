package intellispaces.common.action.delegate;

import intellispaces.common.action.Action0;
import intellispaces.common.action.getter.Getter;

public interface Delegate0<R> extends Action0<R>, Delegate {

  @Override
  Getter<Action0<R>> contractor();
}
