package tech.intellispaces.actions;

import java.util.function.Function;

public interface Action2<R, D1, D2> extends
  Action3<R, D1, D2, Void>,
  Action4<R, D1, D2, Void, Void>,
  Action5<R, D1, D2, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2);

  @Override
  R execute(Object... data);

  <A extends Action2<_R, _D1, _D2>, _R, _D1, _D2> A wrapAction2(
      Function<Action2<R, D1, D2>, A> wrapperFactory
  );
}
