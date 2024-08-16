package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.getter.Getter;

public interface Delegate1<R, D> extends Action1<R, D>, Delegate {

  @Override
  Getter<Action1<R, D>> contractor();
}
