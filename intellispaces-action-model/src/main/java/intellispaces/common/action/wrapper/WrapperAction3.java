package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action3;

public interface WrapperAction3<R, D1, D2, D3> extends WrapperAction, Action3<R, D1, D2, D3> {

  @Override
  Action3<R, D1, D2, D3> wrappedAction();
}
