package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action1;

public interface WrapperAction1<R, D> extends WrapperAction, Action1<R, D> {

  @Override
  Action1<R, D> wrappedAction();
}
