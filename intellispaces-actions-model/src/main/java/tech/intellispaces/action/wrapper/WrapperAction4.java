package tech.intellispaces.action.wrapper;

import tech.intellispaces.action.Action4;

/**
 * The wrapper action that wraps the action of the {@link Action4 action form 4}.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 * @param <D4> fourth processed data type.
 */
public interface WrapperAction4<R, D1, D2, D3, D4> extends WrapperAction, Action4<R, D1, D2, D3, D4> {
}
