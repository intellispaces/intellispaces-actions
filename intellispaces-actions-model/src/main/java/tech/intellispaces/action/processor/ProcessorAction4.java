package tech.intellispaces.action.processor;

import tech.intellispaces.action.Action4;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction4;

import java.util.function.Function;

/**
 * The processor action form 4.<p/>
 *
 * This action form takes four input data to process and does not return a result data.
 * Input data can be changed.
 *
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 * @param <D4> fourth processed data type.
 */
public interface ProcessorAction4<D1, D2, D3, D4> extends Action4<Void, D1, D2, D3, D4> {

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, D4 data4);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, double data4);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, int data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, int data3, double data4);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, double data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, D2 data2, double data3, double data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, int data2, int data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, int data2, int data3, double data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, int data2, double data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, int data2, double data3, double data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, double data2, int data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, double data2, int data3, double data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, double data2, double data3, int data4);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   */
  void process(D1 data1, double data2, double data3, double data4);

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  ProcessorAction4<D1, D2, D3, D4> then(Action4<Void, D1, D2, D3, D4> nextAction);

  /**
   * Returns presentation of this action as {@link RunnableAction}.
   *
   * @param data1 the first processed data.
   * @param data2 the second processed data.
   * @param data3 the third processed data.
   * @param data4 the fourth processed data.
   * @return the runnable action.
   */
  RunnableAction asRunnable(D1 data1, D2 data2, D3 data3, D4 data4);

  /**
   * Wraps this processor action using the wrapper factory and
   * returns action in the form of the processor action 4.
   *
   * @param wrapperFactory the wrapper factory.
   * @return the wrapper action.
   * @param <W> the wrapper type. It is the function that converts this action to wrapper action.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   * @param <_D4> the wrapper fourth data type.
   */
  <W extends WrapperAction4<Void, _D1, _D2, _D3, _D4>, _D1, _D2, _D3, _D4> ProcessorAction4<_D1, _D2, _D3, _D4> wrapProcessorAction4(
      Function<Action4<Void, D1, D2, D3, D4>, W> wrapperFactory
  );
}
