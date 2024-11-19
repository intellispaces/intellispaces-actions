package tech.intellispaces.action.chain.processor;

import tech.intellispaces.action.Action6;
import tech.intellispaces.action.processor.AbstractProcessorAction6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ChainProcessorAction6<D1, D2, D3, D4, D5, D6> extends AbstractProcessorAction6<D1, D2, D3, D4, D5, D6> {
  private final List<Action6<Void, D1, D2, D3, D4, D5, D6>> subActions;

  ChainProcessorAction6(
      Action6<Void, D1, D2, D3, D4, D5, D6> subAction1, Action6<Void, D1, D2, D3, D4, D5, D6> subAction2
  ) {
    var list = new ArrayList<Action6<Void, D1, D2, D3, D4, D5, D6>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action6<Void, D1, D2, D3, D4, D5, D6>> actions() {
    return subActions;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, int data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, int data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, double data5, int data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5, data6));
  }

  private void process(Consumer<Action6<Void, D1, D2, D3, D4, D5, D6>> subActionExecutor) {
    for (var subAction : subActions) {
      subActionExecutor.accept(subAction);
    }
  }

  private List<Action6<Void, D1, D2, D3, D4, D5, D6>> extractActions(Action6<Void, D1, D2, D3, D4, D5, D6> action) {
    if (action instanceof ChainProcessorAction6) {
      return ((ChainProcessorAction6<D1, D2, D3, D4, D5, D6>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
