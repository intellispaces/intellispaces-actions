package tech.intellispaces.actions;

import java.util.function.Function;

public interface Action1<R, D> extends
  Action2<R, D, Void>,
  Action3<R, D, Void, Void>,
  Action4<R, D, Void, Void, Void>,
  Action5<R, D, Void, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D data);

  <A extends Action1<_R, _D>, _R, _D> A wrapAction1(
      Function<Action1<R, D>, A> wrapperFactory
  );
}
