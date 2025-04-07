package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action;

/**
 * The wrapper action.<p/>
 *
 * The wrapper action wraps another action.
 *
 */
public interface WrapperAction extends Action {

  /**
   * The wrapped action.
   */
  Action wrappedAction();
}
