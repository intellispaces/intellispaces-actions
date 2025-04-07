package tech.intellispaces.actions.chain.processor;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.processor.AbstractProcessorAction;
import tech.intellispaces.commons.exception.UnexpectedExceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ChainProcessorAction extends AbstractProcessorAction {
  private final int order;
  private final List<Action> subActions;

  ChainProcessorAction(Action subAction1, Action subAction2) {
    if (subAction1.order() != subAction2.order()) {
      throw UnexpectedExceptions.withMessage("Expected subactions of the same order");
    }
    this.order = subAction1.order();

    var list = new ArrayList<Action>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  @Override
  public int order() {
    return order;
  }

  private List<Action> actions() {
    return subActions;
  }

  @Override
  public void process(Object[] inputs) {
    for (var subAction : subActions) {
      subAction.execute(inputs);
    }
  }

  private List<Action> extractActions(Action action) {
    if (action instanceof ChainProcessorAction) {
      return ((ChainProcessorAction) action).actions();
    } else {
      return List.of(action);
    }
  }
}
