package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;
import tech.intellispaces.actions.wrapper.WrapperAction10;

import java.util.function.Function;

/**
 * The action form .<p/>
 *
 * This is the action form that takes nine inputs and returns result.
 * Inputs can be changed or remain unchanged.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 * @param <D3> the third input type.
 * @param <D4> the fourth input type.
 * @param <D5> the fifth input type.
 * @param <D6> the sixth input type.
 * @param <D7> the seventh input type.
 * @param <D8> the eighth input type.
 * @param <D9> the ninth input type.
 * @param <D10> the tenth input type.
 */
public interface Action10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> extends Action {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9, D10 data10);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9, D10 data10);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9, D10 data10);

  /**
   * Converts this action to the {@link Action9 action form 9}.
   *
   * @param dataExtractor1 a first data extractor.
   * @param dataExtractor2 a second data extractor.
   * @param dataExtractor3 a third data extractor.
   * @param dataExtractor4 a fourth data extractor.
   * @param dataExtractor5 a fifth data extractor.
   * @param dataExtractor6 a sixth data extractor.
   * @param dataExtractor7 a seventh data extractor.
   * @param dataExtractor8 an eighth data extractor.
   * @param dataExtractor9 a ninth data extractor.
   * @param dataExtractor10 a tenth data extractor.
   * @return an action {@link Action9}.
   * @param <_D1> a first input data type.
   * @param <_D2> a second input data type.
   * @param <_D3> a third input data type.
   * @param <_D4> a fourth input data type.
   * @param <_D5> a fifth input data type.
   * @param <_D6> a sixth input data type.
   * @param <_D7> a seventh input data type.
   * @param <_D8> an eighth input data type.
   * @param <_D9> a ninth input data type.
   */
  <_D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> convertToAction9(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5,
      DataAdapterAction<D6> dataExtractor6,
      DataAdapterAction<D7> dataExtractor7,
      DataAdapterAction<D8> dataExtractor8,
      DataAdapterAction<D9> dataExtractor9,
      DataAdapterAction<D10> dataExtractor10
  );

  /**
   * Converts this action to the {@link Action9 action form 9}.
   *
   * @param data the data.
   * @return the action {@link Action9}.
   */
  Action9<R, D2, D3, D4, D5, D6, D7, D8, D9, D10> convertToAction9(D1 data);

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 10.
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
   * @param <_D7> the wrapper seventh data type.
   * @param <_D8> the wrapper eighth data type.
   * @param <_D9> the wrapper ninth data type.
   */
  <W extends WrapperAction10<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10>, _R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> Action10<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> wrapAction10(
      Function<Action10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10>, W> wrapperFactory
  );
}
