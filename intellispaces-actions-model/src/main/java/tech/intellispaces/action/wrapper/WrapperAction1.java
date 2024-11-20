package tech.intellispaces.action.wrapper;

import tech.intellispaces.action.Action1;

/**
 * The wrapper action that wraps the action of the {@link Action1 action form 1}.
 *
 * @param <R> action return type.
 * @param <D> processed data type.
 */
public interface WrapperAction1<R, D> extends WrapperAction, Action1<R, D> {
}
