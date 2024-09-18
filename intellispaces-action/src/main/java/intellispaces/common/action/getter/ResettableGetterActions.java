package intellispaces.common.action.getter;

import intellispaces.common.base.type.Type;

public interface ResettableGetterActions {

  static <R> ResettableGetter<R> get(Type<R> resultType) {
    return new ResettableGetterImpl<>(null);
  }

  static <R> ResettableGetter<R> get(R initValue) {
    return new ResettableGetterImpl<>(initValue);
  }
}
