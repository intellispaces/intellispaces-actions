package tech.intellispaces.commons.action.processor;

import tech.intellispaces.commons.action.Action3;
import tech.intellispaces.commons.action.runnable.RunnableAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction3;
import tech.intellispaces.commons.function.Consumer3;

import java.util.function.Function;

/**
 * The processor action form 3.<p/>
 *
 * This action form takes three input data to process and does not return a result data.
 * Input data can be changed.
 *
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 */
public interface ProcessorAction3<D1, D2, D3> extends Action3<Void, D1, D2, D3>, Consumer3<D1, D2, D3> {

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, D2 data2, D3 data3);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, D2 data2, int data3);

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, D2 data2, double data3);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, int data2, int data3);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, int data2, double data3);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, double data2, int data3);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   * @param data3 third processed data.
   */
  void process(D1 data1, double data2, double data3);

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  ProcessorAction3<D1, D2, D3> andThen(Action3<Void, D1, D2, D3> nextAction);

  /**
   * Returns presentation of this action as {@link RunnableAction}.
   *
   * @param data1 the first processed data.
   * @param data2 the second processed data.
   * @param data3 the third processed data.
   * @return the runnable action.
   */
  RunnableAction asRunnable(D1 data1, D2 data2, D3 data3);

  /**
   * Wraps this processor action using the wrapper factory and
   * returns action in the form of the processor action 3.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   * @param <_D3> the wrapper third data type.
   */
  <W extends WrapperAction3<Void, _D1, _D2, _D3>, _D1, _D2, _D3> ProcessorAction3<_D1, _D2, _D3> wrapProcessorAction3(
      Function<Action3<Void, D1, D2, D3>, W> wrapperFactory
  );
}
