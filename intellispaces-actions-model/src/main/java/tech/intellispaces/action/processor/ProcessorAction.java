package tech.intellispaces.action.processor;

import tech.intellispaces.action.Action;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction;

import java.util.function.Function;

/**
 * The processor action form.<p/>
 *
 * This action form takes array of input data to process and does not return a result data.
 * Input data can be changed.
 */
public interface ProcessorAction extends Action {

  /**
   * Executes action.</p>
   * This method processes and change one or more input data.
   *
   * @param inputData the processed data.
   */
  void process(Object... inputData);

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  ProcessorAction then(Action nextAction);

  /**
   * Returns presentation of this action as {@link RunnableAction}.
   *
   * @param inputData the processed data.
   * @return the runnable action.
   */
  RunnableAction asRunnable(Object... inputData);

  /**
   * Wraps this processor action using the wrapper factory and
   * returns action in the form of the processor action.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   */
  <W extends WrapperAction> ProcessorAction wrapProcessorAction(Function<Action, W> wrapperFactory);
}
