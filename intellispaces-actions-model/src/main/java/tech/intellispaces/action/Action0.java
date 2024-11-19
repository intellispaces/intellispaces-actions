package tech.intellispaces.action;

import tech.intellispaces.action.wrapper.WrapperAction0;

import java.util.function.Function;

/**
 * The action form 0.<p/>
 *
 * This is the action form that does not take input data but returns result data.
 *
 * @param <R> action return type.
 */
public interface Action0<R> extends Action {

  /**
   * Executes action.
   */
  R execute();

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt();

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble();

  /**
   * Returns the {@link Action1 action form 1} of this action.
   */
  Action1<R, Void> convertToAction1();

  /**
   * Converts this action to the {@link Action2 action form 2}.
   */
  Action2<R, Void, Void> convertToAction2();

  /**
   * Converts this action to the {@link Action3 action form 3}.
   */
  Action3<R, Void, Void, Void> convertToAction3();

  /**
   * Converts this action to the {@link Action4 action form 4}.
   */
  Action4<R, Void, Void, Void, Void> convertToAction4();

  /**
   * Converts this action to the {@link Action5 action form 5}.
   */
  Action5<R, Void, Void, Void, Void, Void> convertToAction5();

  /**
   * Converts this action to the {@link Action6 action form 6}.
   */
  Action6<R, Void, Void, Void, Void, Void, Void> convertToAction6();

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 0.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   * @param <_R> the wrapper return data type.
   */
  <W extends WrapperAction0<_R>, _R> Action0<_R> wrapAction0(Function<Action0<R>, W> wrapperFactory);
}
