package intellispaces.actions;

import intellispaces.actions.wrapper.Wrapper0;

import java.util.function.Function;

/**
 * Case of the action without processed data.
 *
 * @param <R> action return type.
 */
public interface Action0<R> extends
  Action1<R, Void>,
  Action2<R, Void, Void>,
  Action3<R, Void, Void, Void>,
  Action4<R, Void, Void, Void, Void>,
  Action5<R, Void, Void, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute();

  <W extends Wrapper0<R>> W wrapAction0(Function<Action0<R>, W> wrapperFactory);

  <W extends Wrapper0<_R>, _R> W convertAction0(Function<Action0<R>, W> wrapperFactory);
}
