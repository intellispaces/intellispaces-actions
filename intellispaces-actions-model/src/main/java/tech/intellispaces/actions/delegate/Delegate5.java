package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.getter.Getter;

public interface Delegate5<R, D1, D2, D3, D4, D5> extends Action5<R, D1, D2, D3, D4, D5>, Delegate {

  @Override
  Getter<Action5<R, D1, D2, D3, D4, D5>> contractor();
}
