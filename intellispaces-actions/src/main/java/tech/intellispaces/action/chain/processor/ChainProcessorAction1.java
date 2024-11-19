package tech.intellispaces.action.chain.processor;

import tech.intellispaces.action.Action1;
import tech.intellispaces.action.processor.AbstractProcessorAction1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ChainProcessorAction1<D> extends AbstractProcessorAction1<D> {
  private final List<Action1<Void, D>> subActions;

  ChainProcessorAction1(Action1<Void, D> subAction1, Action1<Void, D> subAction2) {
    var list = new ArrayList<Action1<Void, D>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action1<Void, D>> actions() {
    return subActions;
  }

  @Override
  public void process(D data) {
    for (var subAction : subActions) {
      subAction.execute(data);
    }
  }

  private List<Action1<Void, D>> extractActions(Action1<Void, D> action) {
    if (action instanceof ChainProcessorAction1) {
      return ((ChainProcessorAction1<D>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
