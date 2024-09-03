package intellispaces.common.action.getter;

/**
 * Resettable getter.
 *
 * @param <R> getter result value type.
 */
public interface ResettableGetter<R> extends Getter<R> {

  void set(R value);
}
