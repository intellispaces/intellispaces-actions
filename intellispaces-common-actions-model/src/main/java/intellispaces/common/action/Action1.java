package intellispaces.common.action;

import intellispaces.common.action.wrapper.Wrapper1;

import java.util.function.Function;

/**
 * Case of the action with one processed data.
 *
 * @param <R> action return type.
 * @param <D> action processed data type.
 */
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

  <W extends Wrapper1<R, D>> W wrapAction1(Function<Action1<R, D>, W> wrapperFactory);

  <W extends Wrapper1<_R, _D>, _R, _D> W convertAction1(Function<Action1<R, D>, W> wrapperFactory);
}
