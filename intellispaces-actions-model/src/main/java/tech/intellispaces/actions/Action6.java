package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;
import tech.intellispaces.actions.wrapper.WrapperAction6;

import java.util.function.Function;

/**
 * The action form 6.<p/>
 *
 * This is the action form that takes six inputs and returns result.
 * Inputs can be changed or remain unchanged.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 * @param <D3> the third input type.
 * @param <D4> the fourth input type.
 * @param <D5> the fifth input type.
 * @param <D6> the sixth input type.
 */
public interface Action6<R, D1, D2, D3, D4, D5, D6> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, D2 data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, int data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4, double data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(D1 data1, double data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, int data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5, double data6);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5, double data6);

  /**
   * Converts this action to the {@link Action5 action form 5}.
   *
   * @param dataExtractor1 a first data extractor.
   * @param dataExtractor2 a second data extractor.
   * @param dataExtractor3 a third data extractor.
   * @param dataExtractor4 a fourth data extractor.
   * @param dataExtractor5 a fifth data extractor.
   * @param dataExtractor6 a sixth data extractor.
   * @return an action {@link Action5}.
   * @param <_D1> a first input data type.
   * @param <_D2> a second input data type.
   * @param <_D3> a third input data type.
   * @param <_D4> a fourth input data type.
   * @param <_D5> a fifth input data type.
   */
  <_D1, _D2, _D3, _D4, _D5> Action5<R, _D1, _D2, _D3, _D4, _D5> convertToAction5(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5,
      DataAdapterAction<D6> dataExtractor6
  );

  /**
   * Converts this action to the {@link Action5 action form 5}.
   *
   * @param data the data.
   * @return the action {@link Action5}.
   */
  Action5<R, D2, D3, D4, D5, D6> convertToAction5(D1 data);

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 6.
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
   * @param <_D6> the wrapper sixth data type.
   */
  <W extends WrapperAction6<_R, _D1, _D2, _D3, _D4, _D5, _D6>, _R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> wrapAction6(
      Function<Action6<R, D1, D2, D3, D4, D5, D6>, W> wrapperFactory
  );
}
