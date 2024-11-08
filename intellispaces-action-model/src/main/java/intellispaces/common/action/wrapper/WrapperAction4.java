package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action4;

public interface WrapperAction4<R, D1, D2, D3, D4> extends WrapperAction, Action4<R, D1, D2, D3, D4> {

  @Override
  Action4<R, D1, D2, D3, D4> wrappedAction();
}
