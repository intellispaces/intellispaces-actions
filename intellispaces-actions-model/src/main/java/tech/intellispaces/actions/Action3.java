package tech.intellispaces.actions;

import java.util.function.Function;

public interface Action3<R, D1, D2, D3> extends
  Action4<R, D1, D2, D3, Void>,
  Action5<R, D1, D2, D3, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3);

  @Override
  R execute(Object... data);

  <A extends Action3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> A wrapAction3(
      Function<Action3<R, D1, D2, D3>, A> wrapperFactory
  );
}
