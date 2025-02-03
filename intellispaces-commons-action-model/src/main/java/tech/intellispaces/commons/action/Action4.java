package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.dataadapter.DataAdapterAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction4;

import java.util.function.Function;

/**
 * The action form 4.<p/>
 *
 * This is the action form that takes four inputs and returns result.
 * Inputs can be changed or remain unchanged.
 *
 * @param <R> the action return type.
 * @param <D1> the first processed data type.
 * @param <D2> the second processed data type.
 * @param <D3> the third processed data type.
 * @param <D4> the fourth processed data type.
 */
public interface Action4<R, D1, D2, D3, D4> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3, double data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3, int data4);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3, double data4);

  /**
   * Converts this action to the {@link Action1 action form 1}.
   *
   * @param dataExtractor1 the first data extractor.
   * @param dataExtractor2 the second data extractor.
   * @param dataExtractor3 the third data extractor.
   * @param dataExtractor4 the fourth data extractor.
   * @return the action {@link Action1}.
   * @param <_D> the action input data type.
   */
  <_D> Action1<R, _D> convertToAction1(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4
  );

  /**
   * Converts this action to the {@link Action5 action form 5}.
   */
  Action5<R, D1, D2, D3, D4, Void> convertToAction5();

  /**
   * Converts this action to the {@link Action6 action form 6}.
   */
  Action6<R, D1, D2, D3, D4, Void, Void> convertToAction6();

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 4.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper return data type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   * @param <_D4> the wrapper fourth data type.
   */
  <W extends WrapperAction4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> wrapAction4(
      Function<Action4<R, D1, D2, D3, D4>, W> wrapperFactory
  );
}
