package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction3;

import java.util.function.Function;

/**
 * Case of the action with three processed data.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 */
public interface Action3<R, D1, D2, D3> extends
  Action4<R, D1, D2, D3, Void>,
  Action5<R, D1, D2, D3, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3);

  int executeReturnInt(D1 data1, D2 data2, D3 data3);

  int executeReturnInt(D1 data1, D2 data2, int data3);

  int executeReturnInt(D1 data1, D2 data2, double data3);

  int executeReturnInt(D1 data1, int data2, int data3);

  int executeReturnInt(D1 data1, int data2, double data3);

  int executeReturnInt(D1 data1, double data2, double data3);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3);

  double executeReturnDouble(D1 data1, D2 data2, int data3);

  double executeReturnDouble(D1 data1, D2 data2, double data3);

  double executeReturnDouble(D1 data1, int data2, int data3);

  double executeReturnDouble(D1 data1, int data2, double data3);

  double executeReturnDouble(D1 data1, double data2, double data3);

  <W extends WrapperAction3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> W wrapAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  );
}
