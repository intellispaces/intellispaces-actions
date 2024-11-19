package tech.intellispaces.action;

import tech.intellispaces.action.dataextractor.DataExtractorAction;
import tech.intellispaces.action.wrapper.WrapperAction2;

import java.util.function.Function;

/**
 * The action form 2.<p/>
 *
 * This is the action form that takes two input data and returns result.
 * The input data can be changed or remain unchanged.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 */
public interface Action2<R, D1, D2> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data1, double data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, int data2);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data1, double data2);

  /**
   * Converts this action to the {@link Action1 action form 1}.
   *
   * @param dataExtractor1 the first data extractor.
   * @param dataExtractor2 the second data extractor.
   * @return the action {@link Action1}.
   * @param <_D> the action input data type.
   */
  <_D> Action1<R, _D> convertToAction1(
      DataExtractorAction<D1> dataExtractor1,
      DataExtractorAction<D2> dataExtractor2
  );

  /**
   * Converts this action to the {@link Action3 action form 3}.
   */
  Action3<R, D1, D2, Void> convertToAction3();

  /**
   * Converts this action to the {@link Action4 action form 4}.
   */
  Action4<R, D1, D2, Void, Void> convertToAction4();

  /**
   * Converts this action to the {@link Action5 action form 5}.
   */
  Action5<R, D1, D2, Void, Void, Void> convertToAction5();

  /**
   * Converts this action to the {@link Action6 action form 6}.
   */
  Action6<R, D1, D2, Void, Void, Void, Void> convertToAction6();

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 2.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper return data type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   */
  <W extends WrapperAction2<_R, _D1, _D2>, _R, _D1, _D2> Action2<_R, _D1, _D2> wrapAction2(
      Function<Action2<R, D1, D2>, W> wrapperFactory
  );
}
