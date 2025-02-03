package tech.intellispaces.commons.action.wrapper;

import tech.intellispaces.commons.action.Action3;

/**
 * The wrapper action that wraps the action of the {@link Action3 action form 3}.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 */
public interface WrapperAction3<R, D1, D2, D3> extends WrapperAction, Action3<R, D1, D2, D3> {
}
