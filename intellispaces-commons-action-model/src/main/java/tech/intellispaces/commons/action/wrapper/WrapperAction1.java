package tech.intellispaces.commons.action.wrapper;

import tech.intellispaces.commons.action.Action1;

/**
 * The wrapper action that wraps the action of the {@link Action1 action form 1}.
 *
 * @param <R> the action return type.
 * @param <D> the processed data type.
 */
public interface WrapperAction1<R, D> extends WrapperAction, Action1<R, D> {
}
