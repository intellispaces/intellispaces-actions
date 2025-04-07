package tech.intellispaces.actions.chain.processor;

import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.processor.AbstractProcessorAction2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ChainProcessorAction2<D1, D2> extends AbstractProcessorAction2<D1, D2> {
  private final List<Action2<Void, D1, D2>> subActions;

  ChainProcessorAction2(Action2<Void, D1, D2> subAction1, Action2<Void, D1, D2> subAction2) {
    var list = new ArrayList<Action2<Void, D1, D2>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action2<Void, D1, D2>> actions() {
    return subActions;
  }

  @Override
  public void process(D1 data1, D2 data2) {
    process(subAction -> subAction.execute(data1, data2));
  }

  @Override
  public void process(D1 data1, int data2) {
    process(subAction -> subAction.execute(data1, data2));
  }

  @Override
  public void process(D1 data1, double data2) {
    process(subAction -> subAction.execute(data1, data2));
  }

  private void process(Consumer<Action2<Void, D1, D2>> subActionExecutor) {
    for (var subAction : subActions) {
      subActionExecutor.accept(subAction);
    }
  }

  private List<Action2<Void, D1, D2>> extractActions(Action2<Void, D1, D2> action) {
    if (action instanceof ChainProcessorAction2) {
      return ((ChainProcessorAction2<D1, D2>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
