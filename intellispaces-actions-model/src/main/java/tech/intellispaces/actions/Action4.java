package tech.intellispaces.actions;

import java.util.function.Function;

public interface Action4<R, D1, D2, D3, D4> extends Action5<R, D1, D2, D3, D4, Void> {
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4);

  <A extends Action4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> A wrapAction4(
      Function<Action4<R, D1, D2, D3, D4>, A> wrapperFactory
  );
}
