package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action1;

public interface Wrapper1<R, D> extends Wrapper, Action1<R, D> {

  @Override
  Action1<R, D> wrappedAction();
}
