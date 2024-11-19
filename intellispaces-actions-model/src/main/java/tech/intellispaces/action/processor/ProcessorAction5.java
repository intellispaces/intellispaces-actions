package tech.intellispaces.action.processor;

import tech.intellispaces.action.Action5;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction5;

import java.util.function.Function;

/**
 * The processor action form 5.<p/>
 *
 * This action form takes five input data to process, it can to change one or more input data and
 * does not return a result data.
 *
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 * @param <D4> fourth processed data type.
 * @param <D5> fifth processed data type.
 */
public interface ProcessorAction5<D1, D2, D3, D4, D5> extends Action5<Void, D1, D2, D3, D4, D5> {

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, D3 data3, double data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, int data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, int data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, int data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, int data3, double data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, double data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, double data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, double data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, D2 data2, double data3, double data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, int data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, int data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, int data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, int data3, double data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, double data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, double data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, double data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, int data2, double data3, double data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, int data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, int data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, int data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, int data3, double data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, double data3, int data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, double data3, int data4, double data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, double data3, double data4, int data5);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   * @param data4 fourth processed data.
   * @param data5 fifth processed data.
   */
  void process(D1 data1, double data2, double data3, double data4, double data5);

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  ProcessorAction5<D1, D2, D3, D4, D5> then(Action5<Void, D1, D2, D3, D4, D5> nextAction);

  /**
   * Returns presentation of this action as {@link RunnableAction}.
   *
   * @param data1 the first processed data.
   * @param data2 the second processed data.
   * @param data3 the third processed data.
   * @param data4 the fourth processed data.
   * @param data5 the fifth processed data.
   * @return the runnable action.
   */
  RunnableAction asRunnable(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  /**
   * Wraps this processor action using the wrapper factory and
   * returns action in the form of the processor action 5.
   *
   * @param wrapperFactory the wrapper factory.
   * @return the wrapper action.
   * @param <W> the wrapper type. It is the function that converts this action to wrapper action.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   * @param <_D4> the wrapper fourth data type.
   * @param <_D5> the wrapper fifth data type.
   */
  <W extends WrapperAction5<Void, _D1, _D2, _D3, _D4, _D5>, _D1, _D2, _D3, _D4, _D5> ProcessorAction5<_D1, _D2, _D3, _D4, _D5> wrapProcessorAction5(
      Function<Action5<Void, D1, D2, D3, D4, D5>, W> wrapperFactory
  );
}
