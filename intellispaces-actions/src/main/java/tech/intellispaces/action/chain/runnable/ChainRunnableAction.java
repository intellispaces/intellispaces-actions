package tech.intellispaces.action.chain.runnable;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.runnable.AbstractRunnableAction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ChainRunnableAction extends AbstractRunnableAction {
  private final List<Action0<Void>> subActions;

  ChainRunnableAction(Action0<Void> subAction1, Action0<Void> subAction2) {
    var list = new ArrayList<Action0<Void>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action0<Void>> actions() {
    return subActions;
  }

  @Override
  public void run() {
    for (var subAction : subActions) {
      subAction.execute();
    }
  }

  private List<Action0<Void>> extractActions(Action0<Void> action) {
    if (action instanceof ChainRunnableAction) {
      return ((ChainRunnableAction) action).actions();
    } else {
      return List.of(action);
    }
  }
}
