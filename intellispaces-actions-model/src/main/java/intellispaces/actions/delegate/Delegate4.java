package intellispaces.actions.delegate;

import intellispaces.actions.Action4;
import intellispaces.actions.getter.Getter;

public interface Delegate4<R, D1, D2, D3, D4> extends Action4<R, D1, D2, D3, D4>, Delegate {

  @Override
  Getter<Action4<R, D1, D2, D3, D4>> contractor();
}
