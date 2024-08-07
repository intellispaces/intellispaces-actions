package tech.intellispaces.actions.getter;

/**
 * Resettable getter.
 *
 * @param <R> getter result value type.
 */
public interface ResettableGetter<R> extends Getter<R> {

  void set(R value);
}
