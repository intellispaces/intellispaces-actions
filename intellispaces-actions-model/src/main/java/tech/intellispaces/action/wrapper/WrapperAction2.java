package tech.intellispaces.action.wrapper;

import tech.intellispaces.action.Action2;

/**
 * The wrapper action that wraps the action of the {@link Action2 action form 2}.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 */
public interface WrapperAction2<R, D1, D2> extends WrapperAction, Action2<R, D1, D2> {
}
