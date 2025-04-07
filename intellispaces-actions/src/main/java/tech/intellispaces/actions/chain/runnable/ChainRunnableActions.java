package tech.intellispaces.actions.chain.runnable;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.runnable.RunnableAction;

public interface ChainRunnableActions {

  static RunnableAction get(
      Action0<Void> action1,
      Action0<Void> action2
  ) {
    return new ChainRunnableAction(action1, action2);
  }
}
