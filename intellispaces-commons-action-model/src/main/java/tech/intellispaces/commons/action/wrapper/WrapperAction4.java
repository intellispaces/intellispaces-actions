package tech.intellispaces.commons.action.wrapper;

import tech.intellispaces.commons.action.Action4;

/**
 * The wrapper action that wraps the action of the {@link Action4 action form 4}.
 *
 * @param <R> the action return type.
 * @param <D1> the first processed data type.
 * @param <D2> the second processed data type.
 * @param <D3> the third processed data type.
 * @param <D4> the fourth processed data type.
 */
public interface WrapperAction4<R, D1, D2, D3, D4> extends WrapperAction, Action4<R, D1, D2, D3, D4> {
}
