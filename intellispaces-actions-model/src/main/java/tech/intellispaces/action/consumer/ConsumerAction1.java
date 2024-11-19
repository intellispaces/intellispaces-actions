package tech.intellispaces.action.consumer;

import tech.intellispaces.action.Action1;

import java.util.function.Consumer;

/**
 * The consumer action form 1.<p/>
 *
 * This action form takes single input data. Input data are not changed.
 * Action does not return a result data.
 */
public interface ConsumerAction1<D> extends Action1<Void, D>, Consumer<D> {

}
