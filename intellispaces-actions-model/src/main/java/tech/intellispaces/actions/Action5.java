package tech.intellispaces.actions;

import tech.intellispaces.actions.wrapper.Wrapper5;

import java.util.function.Function;

/**
 * Case of the action with five processed data.
 *
 * @param <R> action return type.
 * @param <D1> action first processed data type.
 * @param <D2> action second processed data type.
 * @param <D3> action third processed data type.
 * @param <D4> action four processed data type.
 * @param <D5> action five processed data type.
 */
public interface Action5<R, D1, D2, D3, D4, D5> extends Action {

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  <W extends Wrapper5<R, D1, D2, D3, D4, D5>> W wrapAction5(Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory);

  <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory
  );
}
