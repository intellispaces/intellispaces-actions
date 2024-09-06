package intellispaces.common.action.delegate;

import intellispaces.common.action.Action3;
import intellispaces.common.action.getter.Getter;

public interface Delegate3<R, D1, D2, D3> extends Action3<R, D1, D2, D3>, Delegate {

  @Override
  Getter<Action3<R, D1, D2, D3>> contractor();
}
