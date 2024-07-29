package tech.intellispaces.actions.string;

import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.Executor;

import java.util.Objects;

public interface StringActions {

  static Executor commaAppender(StringBuilder sb) {
    Objects.requireNonNull(sb);
    return Actions.executor(() -> sb.append(", "))
        .wrap(Actions.notFirstTimeOnlyActionFactory());
  }
}
