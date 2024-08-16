package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.getter.Getter;

public interface Delegate3<R, D1, D2, D3> extends Action3<R, D1, D2, D3>, Delegate {

  @Override
  Getter<Action3<R, D1, D2, D3>> contractor();
}
