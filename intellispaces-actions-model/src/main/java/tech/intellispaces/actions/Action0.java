package tech.intellispaces.actions;

import java.util.function.Function;

public interface Action0<R> extends
  Action,
  Action1<R, Void>,
  Action5<R, Void, Void, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute();

  <A extends Action0<_R>, _R> A wrapAction0(Function<Action0<R>, A> wrapperFactory);
}
