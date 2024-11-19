package tech.intellispaces.action.processor;

import tech.intellispaces.action.Action2;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction2;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The processor action form 2.<p/>
 *
 * This action form takes two input data to process, it can to change one or more input data and
 * does not return a result data.
 *
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 */
public interface ProcessorAction2<D1, D2> extends Action2<Void, D1, D2>, BiConsumer<D1, D2> {

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   */
  void process(D1 data1, D2 data2);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   */
  void process(D1 data1, int data2);

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data1 first processed data.
   * @param data2 second processed data.
   */
  void process(D1 data1, double data2);

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  ProcessorAction2<D1, D2> then(Action2<Void, D1, D2> nextAction);

  /**
   * Returns presentation of this action as {@link RunnableAction}.
   *
   * @param data1 the first processed data.
   * @param data2 the second processed data.
   * @return the runnable action.
   */
  RunnableAction asRunnable(D1 data1, D2 data2);

  /**
   * Wraps this processor action using the wrapper factory and
   * returns action in the form of the processor action 2.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_D1> the wrapper first data type.
   * @param <_D2> the wrapper second data type.
   */
  <W extends WrapperAction2<Void, _D1, _D2>, _D1, _D2> ProcessorAction2<_D1, _D2> wrapProcessorAction2(
      Function<Action2<Void, D1, D2>, W> wrapperFactory
  );
}
