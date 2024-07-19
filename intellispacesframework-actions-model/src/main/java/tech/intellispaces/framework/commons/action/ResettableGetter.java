package tech.intellispaces.framework.commons.action;

/**
 * Resettable getter.
 *
 * @param <T> getter result value type.
 */
public interface ResettableGetter<T> extends Getter<T> {

  void set(T value);
}
