package intellispaces.actions.delegate;

import intellispaces.actions.Action2;
import intellispaces.actions.getter.Getter;

public interface Delegate2<R, D1, D2> extends Action2<R, D1, D2>, Delegate {

  @Override
  Getter<Action2<R, D1, D2>> contractor();
}
