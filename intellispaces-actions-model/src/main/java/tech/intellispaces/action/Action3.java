package tech.intellispaces.action;

import tech.intellispaces.action.dataextractor.DataExtractorAction;
import tech.intellispaces.action.wrapper.WrapperAction3;

import java.util.function.Function;

/**
 * The action form 3.<p/>
 *
 * This is the action form that takes three input data and returns result.
 * The input data can be changed or remain unchanged.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 */
public interface Action3<R, D1, D2, D3> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2, double data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, int data3);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2, double data3);

  /**
   * Converts this action to the {@link Action1 action form 1}.
   *
   * @param dataExtractor1 first data extractor.
   * @param dataExtractor2 second data extractor.
   * @param dataExtractor3 third data extractor.
   * @return the {@link Action1} form of this action.
   * @param <_D> the action input data type.
   */
  <_D> Action1<R, _D> convertToAction1(
      DataExtractorAction<D1> dataExtractor1,
      DataExtractorAction<D2> dataExtractor2,
      DataExtractorAction<D3> dataExtractor3
  );

  /**
   * Converts this action to the {@link Action4 action form 4}.
   */
  Action4<R, D1, D2, D3, Void> convertToAction4();

  /**
   * Converts this action to the {@link Action5 action form 5}.
   */
  Action5<R, D1, D2, D3, Void, Void> convertToAction5();

  /**
   * Converts this action to the {@link Action6 action form 6}.
   */
  Action6<R, D1, D2, D3, Void, Void, Void> convertToAction6();

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 3.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper return data type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   */
  <W extends WrapperAction3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> wrapAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  );
}
