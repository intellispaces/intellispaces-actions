package tech.intellispaces.actions.onetime;

import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public interface NotFirstTimeOnlyActions {

  static <V, D1, D2, D3, D4, D5> Function<Action5<V, D1, D2, D3, D4, D5>, Action5<V, D1, D2, D3, D4, D5>> factory() {
    return NotFirstTimeOnlyAction::new;
  }
}
