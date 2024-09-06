package intellispaces.common.action.delegate;

import intellispaces.common.action.Action5;
import intellispaces.common.action.getter.Getter;

public interface Delegate5<R, D1, D2, D3, D4, D5> extends Action5<R, D1, D2, D3, D4, D5>, Delegate {

  @Override
  Getter<Action5<R, D1, D2, D3, D4, D5>> contractor();
}
