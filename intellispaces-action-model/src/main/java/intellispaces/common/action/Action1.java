package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction1;

import java.util.function.Function;

/**
 * Case of the action with one processed data.
 *
 * @param <R> action return type.
 * @param <D> processed data type.
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

  int executeReturnInt(D data);

  double executeReturnDouble(D data);

  <W extends WrapperAction1<_R, _D>, _R, _D> W wrapAction1(Function<Action1<R, D>, W> wrapperFactory);
}
