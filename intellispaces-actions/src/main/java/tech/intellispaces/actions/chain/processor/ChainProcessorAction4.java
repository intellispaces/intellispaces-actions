package tech.intellispaces.actions.chain.processor;

import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.processor.AbstractProcessorAction4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ChainProcessorAction4<D1, D2, D3, D4> extends AbstractProcessorAction4<D1, D2, D3, D4> {
  private final List<Action4<Void, D1, D2, D3, D4>> subActions;

  ChainProcessorAction4(Action4<Void, D1, D2, D3, D4> subAction1, Action4<Void, D1, D2, D3, D4> subAction2) {
    var list = new ArrayList<Action4<Void, D1, D2, D3, D4>>();
    list.addAll(extractActions(subAction1));
    list.addAll(extractActions(subAction2));
    this.subActions = Collections.unmodifiableList(list);
  }

  private List<Action4<Void, D1, D2, D3, D4>> actions() {
    return subActions;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4) {
    process(subAction -> subAction.execute(data1, data2, data3, data4));
  }

  private void process(Consumer<Action4<Void, D1, D2, D3, D4>> subActionExecutor) {
    for (var subAction : subActions) {
      subActionExecutor.accept(subAction);
    }
  }

  private List<Action4<Void, D1, D2, D3, D4>> extractActions(Action4<Void, D1, D2, D3, D4> action) {
    if (action instanceof ChainProcessorAction4) {
      return ((ChainProcessorAction4<D1, D2, D3, D4>) action).actions();
    } else {
      return List.of(action);
    }
  }
}
