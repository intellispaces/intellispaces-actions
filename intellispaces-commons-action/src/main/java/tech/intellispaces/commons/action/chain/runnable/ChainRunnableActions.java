package tech.intellispaces.commons.action.chain.runnable;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.runnable.RunnableAction;

public interface ChainRunnableActions {

  static RunnableAction get(
      Action0<Void> action1,
      Action0<Void> action2
  ) {
    return new ChainRunnableAction(action1, action2);
  }
}
