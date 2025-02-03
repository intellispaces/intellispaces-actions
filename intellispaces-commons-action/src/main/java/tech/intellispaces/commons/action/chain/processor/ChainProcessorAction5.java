package tech.intellispaces.commons.action.chain.processor;

import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.processor.AbstractProcessorAction5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ChainProcessorAction5<D1, D2, D3, D4, D5> extends AbstractProcessorAction5<D1, D2, D3, D4, D5> {
  private final List<Action5<Void, D1, D2, D3, D4, D5>> subActions;

  ChainProcessorAction5(Action5<Void, D1, D2, D3, D4, D5> subAction1, Action5<Void, D1, D2, D3, D4, D5> subAction2) {
    var list = new ArrayList<Action5<Void, D1, D2, D3, D4, D5>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action5<Void, D1, D2, D3, D4, D5>> actions() {
    return subActions;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, int data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, double data5) {
    process(subAction -> subAction.execute(data1, data2, data3, data4, data5));
  }

  private void process(Consumer<Action5<Void, D1, D2, D3, D4, D5>> subActionExecutor) {
    for (var subAction : subActions) {
      subActionExecutor.accept(subAction);
    }
  }

  private List<Action5<Void, D1, D2, D3, D4, D5>> extractActions(Action5<Void, D1, D2, D3, D4, D5> action) {
    if (action instanceof ChainProcessorAction5) {
      return ((ChainProcessorAction5<D1, D2, D3, D4, D5>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
