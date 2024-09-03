package intellispaces.common.action.getter;

import intellispaces.common.type.Type;

public interface ResettableGetters {

  static <R> ResettableGetter<R> get(Type<R> resultType) {
    return new ResettableGetterImpl<>(null);
  }

  static <R> ResettableGetter<R> get(R initValue) {
    return new ResettableGetterImpl<>(initValue);
  }
}
