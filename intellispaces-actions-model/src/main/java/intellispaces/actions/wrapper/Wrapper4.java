package intellispaces.actions.wrapper;

import intellispaces.actions.Action4;

public interface Wrapper4<R, D1, D2, D3, D4> extends Wrapper, Action4<R, D1, D2, D3, D4> {

  @Override
  Action4<R, D1, D2, D3, D4> wrappedAction();
}
