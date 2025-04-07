package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.Action3;

/**
 * The wrapper action that wraps the action of the {@link Action3 action form 3}.
 *
 * @param <R> the action return type.
 * @param <D1> the first processed data type.
 * @param <D2> the second processed data type.
 * @param <D3> the third processed data type.
 */
public interface WrapperAction3<R, D1, D2, D3> extends WrapperAction, Action3<R, D1, D2, D3> {
}
