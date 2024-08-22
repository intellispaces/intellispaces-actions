package intellispaces.actions.wrapper;

import intellispaces.actions.Action1;

public interface Wrapper1<R, D> extends Wrapper, Action1<R, D> {

  @Override
  Action1<R, D> wrappedAction();
}
