package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action0;

public interface WrapperAction0<R> extends WrapperAction, Action0<R> {

  @Override
  Action0<R> wrappedAction();
}
