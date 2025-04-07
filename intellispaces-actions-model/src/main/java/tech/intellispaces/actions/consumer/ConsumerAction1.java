package tech.intellispaces.actions.consumer;

import tech.intellispaces.actions.Action1;

import java.util.function.Consumer;

/**
 * The consumer action form 1.<p/>
 *
 * This action form takes single input data and does not return a result data.
 * Input data are not changed.
 */
public interface ConsumerAction1<D> extends Action1<Void, D>, Consumer<D> {

}
