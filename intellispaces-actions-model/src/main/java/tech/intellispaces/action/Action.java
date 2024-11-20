package tech.intellispaces.action;

import tech.intellispaces.action.exception.IrregularActionFormException;
import tech.intellispaces.action.wrapper.WrapperAction;

import java.util.function.Function;

/**
 * The action.<p/>
 *
 * The action is an object that implements some single operation executed on input data and then
 * optionality returns single result data.<p/>
 *
 * The action takes array of the input data and returns result data.
 * The action can to change input data.
 */
public interface Action {

  /**
   * Executes action.
   *
   * @param inputData the input data that the action is being executed on.
   * @return action result data.
   */
  Object execute(Object... inputData);

  /**
   * The special form of the execute method to avoid autoboxing.
   *
   * @return action result data.
   */
  int executeReturnInt(Object... inputData);

  /**
   * The special form of the execute method to avoid autoboxing.
   *
   * @return action result data.
   */
  double executeReturnDouble(Object... inputData);

  /**
   * Action order.</p>
   *
   * The action order is the number of input data took.
   */
  int order();

  /**
   * Tries to return the {@link Action0 action 0 form} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action0}.
   */
  <R> Action0<R> castToAction0();

  /**
   * Tries to return the {@link Action1 action form 1} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action1}.
   */
  <R, D> Action1<R, D> castToAction1();

  /**
   * Tries to return the {@link Action2 action form 2} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action2}.
   */
  <R, D1, D2> Action2<R, D1, D2> castToAction2();

  /**
   * Tries to return the {@link Action3 action form 3} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action3}.
   */
  <R, D1, D2, D3> Action3<R, D1, D2, D3> castToAction3();

  /**
   * Tries to return  the {@link Action4 action form 4} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action4}.
   */
  <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> castToAction4();

  /**
   * Tries to return the {@link Action5 action form 5} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action5}.
   */
  <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> castToAction5();

  /**
   * Tries to return the {@link Action6 action form 6} of this action or
   * throws {@link IrregularActionFormException} if this action is not {@link Action6}.
   */
  <R, D1, D2, D3, D4, D5, D6> Action6<R, D1, D2, D3, D4, D5, D6> castToAction6();

  /**
   * Wrap this action.
   *
   * @param wrapperFactory the wrapper action factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> the wrapper type.
   */
  <W extends WrapperAction> Action wrapAction(Function<Action, W> wrapperFactory);
}
