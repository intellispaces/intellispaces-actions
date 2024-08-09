package tech.intellispaces.actions.getter;

public interface ResettableGetters {

  static <R> ResettableGetter<R> get() {
    return new ResettableGetterImpl<>();
  }

  static <R> ResettableGetter<R> get(R initValue) {
    return new ResettableGetterImpl<>(initValue);
  }
}
