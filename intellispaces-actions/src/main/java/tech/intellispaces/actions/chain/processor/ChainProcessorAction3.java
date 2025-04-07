package tech.intellispaces.actions.chain.processor;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.processor.AbstractProcessorAction3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ChainProcessorAction3<D1, D2, D3> extends AbstractProcessorAction3<D1, D2, D3> {
  private final List<Action3<Void, D1, D2, D3>> subActions;

  ChainProcessorAction3(Action3<Void, D1, D2, D3> subAction1, Action3<Void, D1, D2, D3> subAction2) {
    var list = new ArrayList<Action3<Void, D1, D2, D3>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action3<Void, D1, D2, D3>> actions() {
    return subActions;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  @Override
  public void process(D1 data1, int data2, int data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  @Override
  public void process(D1 data1, int data2, double data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  @Override
  public void process(D1 data1, double data2, int data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  @Override
  public void process(D1 data1, double data2, double data3) {
    process(subAction -> subAction.execute(data1, data2, data3));
  }

  private void process(Consumer<Action3<Void, D1, D2, D3>> subActionExecutor) {
    for (var subAction : subActions) {
      subActionExecutor.accept(subAction);
    }
  }

  private List<Action3<Void, D1, D2, D3>> extractActions(Action3<Void, D1, D2, D3> action) {
    if (action instanceof ChainProcessorAction3) {
      return ((ChainProcessorAction3<D1, D2, D3>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
