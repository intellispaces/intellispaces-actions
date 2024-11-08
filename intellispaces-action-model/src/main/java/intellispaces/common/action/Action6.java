package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction6;

import java.util.function.Function;

/**
 * Case of the action with six processed data.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 * @param <D4> fourth processed data type.
 * @param <D5> fifth processed data type.
 * @param <D6> sixth data type.
 */
public interface Action6<R, D1, D2, D3, D4, D5, D6> extends Action {

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6);

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6);

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6);

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6);

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6);

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6);

  R execute(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6);

  R execute(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6);

  R execute(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6);

  R execute(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6);

  R execute(D1 data1, D2 data2, int data3, int data4, int data5, int data6);

  R execute(D1 data1, D2 data2, int data3, int data4, int data5, double data6);

  R execute(D1 data1, D2 data2, int data3, int data4, double data5, double data6);

  R execute(D1 data1, D2 data2, int data3, double data4, double data5, double data6);

  R execute(D1 data1, D2 data2, double data3, double data4, double data5, double data6);

  R execute(D1 data1, int data2, int data3, int data4, int data5, int data6);

  R execute(D1 data1, int data2, int data3, int data4, int data5, double data6);

  R execute(D1 data1, int data2, int data3, int data4, double data5, double data6);

  R execute(D1 data1, int data2, int data3, double data4, double data5, double data6);

  R execute(D1 data1, int data2, double data3, double data4, double data5, double data6);

  R execute(D1 data1, double data2, double data3, double data4, double data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, int data6);

  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5, double data6);

  int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5, double data6);

  int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, int data6);

  int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, double data6);

  int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5, double data6);

  int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5, double data6);

  int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5, double data6);

  int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, int data6);

  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5, double data6);

  double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5, double data6);

  double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, int data6);

  double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, double data6);

  double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5, double data6);

  double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5, double data6);

  double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5, double data6);

  double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5, double data6);

  <W extends WrapperAction6<_R, _D1, _D2, _D3, _D4, _D5, _D6>, _R, _D1, _D2, _D3, _D4, _D5, _D6> W wrapAction6(
      Function<Action6<R, D1, D2, D3, D4, D5, D6>, W> wrapperFactory
  );
}
