package tech.intellispaces.actions;

import tech.intellispaces.actions.wrapper.Wrapper4;

import java.util.function.Function;

/**
 * Case of the action with four processed data.
 *
 * @param <R> action return type.
 * @param <D1> action first processed data type.
 * @param <D2> action second processed data type.
 * @param <D3> action third processed data type.
 * @param <D4> action four processed data type.
 */
public interface Action4<R, D1, D2, D3, D4> extends Action5<R, D1, D2, D3, D4, Void> {
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4);

  <W extends Wrapper4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W wrapAction4(
      Function<Action4<R, D1, D2, D3, D4>, W> wrapperFactory
  );
}
