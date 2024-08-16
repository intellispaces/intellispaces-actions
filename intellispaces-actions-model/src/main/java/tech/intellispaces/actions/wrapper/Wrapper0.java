package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action0;

public interface Wrapper0<R> extends Wrapper, Action0<R> {

  @Override
  Action0<R> wrappedAction();
}
