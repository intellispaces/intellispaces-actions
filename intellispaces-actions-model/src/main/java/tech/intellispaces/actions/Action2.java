package tech.intellispaces.actions;

import tech.intellispaces.actions.wrapper.Wrapper2;

import java.util.function.Function;

/**
 * Case of the action with two processed data.
 *
 * @param <R> action return type.
 * @param <D1> action first processed data type.
 * @param <D2> action second processed data type.
 */
public interface Action2<R, D1, D2> extends
  Action3<R, D1, D2, Void>,
  Action4<R, D1, D2, Void, Void>,
  Action5<R, D1, D2, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2);

  <W extends Wrapper2<R, D1, D2>> W wrapAction2(Function<Action2<R, D1, D2>, W> wrapperFactory);

  <W extends Wrapper2<_R, _D1, _D2>, _R, _D1, _D2> W convertAction2(
      Function<Action2<R, D1, D2>, W> wrapperFactory
  );
}
