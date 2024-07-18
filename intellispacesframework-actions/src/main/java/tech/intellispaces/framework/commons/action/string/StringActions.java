package tech.intellispaces.framework.commons.action.string;

import tech.intellispaces.framework.commons.action.Actions;
import tech.intellispaces.framework.commons.action.Executor;

import java.util.Objects;

public interface StringActions {

  static Executor commaAppender(StringBuilder sb) {
    Objects.requireNonNull(sb);
    return Actions.executor(() -> sb.append(", "))
        .wrap(Actions.notFirstTimeOnlyActionFactory());
  }
}
