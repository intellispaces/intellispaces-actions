package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action2;

/**
 * The wrapper action that wraps the action of the {@link Action2 action form 2}.
 *
 * @param <R> the action return type.
 * @param <D1> the first processed data type.
 * @param <D2> the second processed data type.
 */
public interface WrapperAction2<R, D1, D2> extends WrapperAction, Action2<R, D1, D2> {
}
