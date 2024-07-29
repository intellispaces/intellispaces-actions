package tech.intellispaces.actions;

/**
 * Resettable getter.
 *
 * @param <T> getter result value type.
 */
public interface ResettableGetter<T> extends Getter<T> {

  void set(T value);
}
