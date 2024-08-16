package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action2;

public interface Wrapper2<R, D1, D2> extends Wrapper, Action2<R, D1, D2> {

  @Override
  Action2<R, D1, D2> wrappedAction();
}
