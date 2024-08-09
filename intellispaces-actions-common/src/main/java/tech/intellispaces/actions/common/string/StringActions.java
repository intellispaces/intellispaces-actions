package tech.intellispaces.actions.common.string;

import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.executor.Executor;

import java.util.Objects;

public interface StringActions {

  static Executor commaAppender(StringBuilder sb) {
    Objects.requireNonNull(sb);
    return Actions.executor(() -> sb.append(", "))
        .wrap(Actions.notFirstTimeOnlyActionFactory5());
  }
}
