package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action0;

public interface Wrapper0<R> extends Wrapper, Action0<R> {

  @Override
  Action0<R> wrappedAction();
}
