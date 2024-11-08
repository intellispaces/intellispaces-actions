package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action5;

public interface WrapperAction5<R, D1, D2, D3, D4, D5> extends WrapperAction, Action5<R, D1, D2, D3, D4, D5> {

  @Override
  Action5<R, D1, D2, D3, D4, D5> wrappedAction();
}
