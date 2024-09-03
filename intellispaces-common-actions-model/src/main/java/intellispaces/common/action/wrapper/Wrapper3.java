package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action3;

public interface Wrapper3<R, D1, D2, D3> extends Wrapper, Action3<R, D1, D2, D3> {

  @Override
  Action3<R, D1, D2, D3> wrappedAction();
}
