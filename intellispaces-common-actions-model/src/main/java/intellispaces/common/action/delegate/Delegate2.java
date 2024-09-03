package intellispaces.common.action.delegate;

import intellispaces.common.action.Action2;
import intellispaces.common.action.getter.Getter;

public interface Delegate2<R, D1, D2> extends Action2<R, D1, D2>, Delegate {

  @Override
  Getter<Action2<R, D1, D2>> contractor();
}
