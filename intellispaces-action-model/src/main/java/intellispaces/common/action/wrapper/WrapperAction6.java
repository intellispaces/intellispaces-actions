package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action6;

public interface WrapperAction6<R, D1, D2, D3, D4, D5, D6> extends WrapperAction, Action6<R, D1, D2, D3, D4, D5, D6> {

  @Override
  Action6<R, D1, D2, D3, D4, D5, D6> wrappedAction();
}
