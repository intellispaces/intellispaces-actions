package tech.intellispaces.actions.multi;

import tech.intellispaces.actions.Action5;

public interface MultiActions {

  static <V, D1, D2, D3, D4, D5> Action5<V, D1, D2, D3, D4, D5> of(
      Action5<V, D1, D2, D3, D4, D5> action1, Action5<V, D1, D2, D3, D4, D5> action2
  ) {
    return new MultiAction<>(action1, action2);
  }
}
