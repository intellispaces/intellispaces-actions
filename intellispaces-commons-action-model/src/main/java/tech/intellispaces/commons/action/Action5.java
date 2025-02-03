package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.wrapper.WrapperAction5;

import java.util.function.Function;

/**
 * The action form 5.<p/>
 *
 * This is the action form that takes five inputs and returns result.
 * Inputs can be changed or remain unchanged.
 *
 * @param <R> action return type.
 * @param <D1> first input type.
 * @param <D2> second input type.
 * @param <D3> third input type.
 * @param <D4> fourth input type.
 * @param <D5> fifth input type.
 */
public interface Action5<R, D1, D2, D3, D4, D5> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3, double data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3, int data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3, int data4, double data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3, double data4, int data5);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3, double data4, double data5);

  /**
   * Converts this action to the {@link Action6 action form 6}.
   */
  Action6<R, D1, D2, D3, D4, D5, Void> convertToAction6();

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 5.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper return data type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   * @param <_D4> the wrapper fourth data type.
   * @param <_D5> the wrapper fifth data type.
   */
  <W extends WrapperAction5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> wrapAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory
  );
}
