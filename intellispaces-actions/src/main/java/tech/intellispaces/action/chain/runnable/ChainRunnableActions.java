package tech.intellispaces.action.chain.runnable;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.runnable.RunnableAction;

public interface ChainRunnableActions {

  static RunnableAction get(
      Action0<Void> action1,
      Action0<Void> action2
  ) {
    return new ChainRunnableAction(action1, action2);
  }
}
