package tech.intellispaces.action.runnable;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.wrapper.WrapperAction0;

import java.util.function.Function;

/**
 * The runnable action form.<p/>
 *
 * This is the action form that does not take input data and does not return a result data.
 */
public interface RunnableAction extends Action0<Void> {

  void run();

  /**
   * Combines this action into a chain with the next action.
   *
   * @param nextAction the next action.
   * @return the processor action that combines this action and the next action.
   */
  RunnableAction then(Action0<Void> nextAction);

  /**
   * Wraps this runnable action using the wrapper factory.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   */
  <W extends WrapperAction0<Void>> RunnableAction wrapRunnableAction(
      Function<Action0<Void>, W> wrapperFactory
  );
}
