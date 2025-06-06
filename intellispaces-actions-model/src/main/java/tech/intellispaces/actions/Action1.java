package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;
import tech.intellispaces.actions.wrapper.WrapperAction1;

import java.util.function.Function;

/**
 * The action form 1.<p/>
 *
 * This is the action form that takes single input and returns result.
 * The input can be changed or remain unchanged.
 *
 * @param <R> the action return type.
 * @param <D> the input type.
 */
public interface Action1<R, D> extends Action {

  /**
   * Executes action.
   */
  R execute(D data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(int data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  R execute(double data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(D data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(int data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  int executeReturnInt(double data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(D data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(int data);

  /**
   * The special form of the execute method to avoid autoboxing.
   */
  double executeReturnDouble(double data);

  /**
   * Converts this action to the {@link Action0 action form 0}.
   *
   * @param dataExtractor the data extractor.
   * @return the action {@link Action0}.
   */
  Action0<R> convertToAction0(DataAdapterAction<D> dataExtractor);

  /**
   * Converts this action to the {@link Action0 action form 0}.
   *
   * @param data the data.
   * @return the action {@link Action0}.
   */
  Action0<R> convertToAction0(D data);

  /**
   * Converts this action to the {@link Action2 action form 2}.
   */
  Action2<R, D, Void> convertToAction2();

  /**
   * Converts this action to the {@link Action3 action form 3}.
   */
  Action3<R, D, Void, Void> convertToAction3();

  /**
   * Converts this action to the {@link Action4 action form 4}.
   */
  Action4<R, D, Void, Void, Void> convertToAction4();

  /**
   * Converts this action to the {@link Action5 action form 5}.
   */
  Action5<R, D, Void, Void, Void, Void> convertToAction5();

  /**
   * Converts this action to the {@link Action6 action form 6}.
   */
  Action6<R, D, Void, Void, Void, Void, Void> convertToAction6();

  /**
   * Wraps this action using the wrapper factory and returns action in the form of the action 1.
   *
   * @param wrapperFactory the wrapper factory. It is the function that converts this action to wrapper action.
   * @return the wrapper action.
   * @param <W> a wrapper type.
   * @param <_R> a wrapper return data type.
   * @param <_D> a wrapper data type.
   */
  <W extends WrapperAction1<_R, _D>, _R, _D> Action1<_R, _D> wrapAction1(Function<Action1<R, D>, W> wrapperFactory);
}
