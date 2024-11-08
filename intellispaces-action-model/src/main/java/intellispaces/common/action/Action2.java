package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction2;

import java.util.function.Function;

/**
 * Case of the action with two processed data.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
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

  int executeReturnInt(D1 data1, D2 data2);

  int executeReturnInt(D1 data1, int data2);

  int executeReturnInt(D1 data1, double data2);

  double executeReturnDouble(D1 data1, D2 data2);

  double executeReturnDouble(D1 data1, int data2);

  double executeReturnDouble(D1 data1, double data2);

  <W extends WrapperAction2<_R, _D1, _D2>, _R, _D1, _D2> W wrapAction2(Function<Action2<R, D1, D2>, W> wrapperFactory);
}
