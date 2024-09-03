package intellispaces.common.action.delegate;

import intellispaces.common.action.Action1;
import intellispaces.common.action.getter.Getter;

public interface Delegate1<R, D> extends Action1<R, D>, Delegate {

  @Override
  Getter<Action1<R, D>> contractor();
}
