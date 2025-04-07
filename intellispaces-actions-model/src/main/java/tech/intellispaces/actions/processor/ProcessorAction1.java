package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.runnable.RunnableAction;
import tech.intellispaces.actions.wrapper.WrapperAction1;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * The processor action form 1.<p/>
 *
 * This action form takes single input data to process and does not return a result data.
 * Input data can be changed.
 *
 * @param <D> processed data type.
 */
public interface ProcessorAction1<D> extends Action1<Void, D>, Consumer<D> {

  /**
   * Executes action.</p>
   * This method processes and change input data.
   *
   * @param data processed data.
   */
  void process(D data);

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  ProcessorAction1<D> andThen(Action1<Void, D> nextAction);

  /**
   * Returns presentation of this action as {@link RunnableAction}.
   *
   * @param data the processed data.
   * @return the runnable action.
   */
  RunnableAction asRunnable(D data);

  /**
   * Wraps this processor action using the wrapper factory and
   * returns action in the form of the processor action 1.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_D> the wrapper data type.
   */
  <W extends WrapperAction1<Void, _D>, _D> ProcessorAction1<_D> wrapProcessorAction1(
      Function<Action1<Void, D>, W> wrapperFactory
  );
}
