package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action3;

public interface Wrapper3<R, D1, D2, D3> extends Wrapper, Action3<R, D1, D2, D3> {

  @Override
  Action3<R, D1, D2, D3> wrappedAction();
}
