package intellispaces.common.action;

import intellispaces.common.action.wrapper.Wrapper5;

import java.util.function.Function;

/**
 * Case of the action with five processed data.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 * @param <D4> fourth processed data type.
 * @param <D5> fifth processed data type.
 */
public interface Action5<R, D1, D2, D3, D4, D5> extends Action6<R, D1, D2, D3, D4, D5, Void> {

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5);

  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5);

  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5);

  int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5);

  int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5);

  int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5);

  int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5);

  int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5);

  int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5);

  int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5);

  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5);

  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5);

  double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5);

  double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5);

  double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5);

  double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5);

  double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5);

  double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5);

  double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5);

  <W extends Wrapper5<R, D1, D2, D3, D4, D5>> W wrapAction5(Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory);

  <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory
  );
}
