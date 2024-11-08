package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action2;

public interface WrapperAction2<R, D1, D2> extends WrapperAction, Action2<R, D1, D2> {

  @Override
  Action2<R, D1, D2> wrappedAction();
}
