package intellispaces.actions.delegate;

import intellispaces.actions.Action1;
import intellispaces.actions.getter.Getter;

public interface Delegate1<R, D> extends Action1<R, D>, Delegate {

  @Override
  Getter<Action1<R, D>> contractor();
}
