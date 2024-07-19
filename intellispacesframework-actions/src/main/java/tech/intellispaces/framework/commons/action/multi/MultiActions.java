package tech.intellispaces.framework.commons.action.multi;

import tech.intellispaces.framework.commons.action.Action;

public interface MultiActions {

  static <V, D1, D2, D3, D4, D5> Action<V, D1, D2, D3, D4, D5> of(
      Action<V, D1, D2, D3, D4, D5> action1, Action<V, D1, D2, D3, D4, D5> action2
  ) {
    return new MultiAction<>(action1, action2);
  }
}
