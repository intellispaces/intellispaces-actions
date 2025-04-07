package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.wrapper.WrapperAction1;

class ProcessorAction1BasedOnAction1<D> extends AbstractProcessorAction1<D> implements WrapperAction1<Void, D> {
  private final Action1<Void, D> action1;

  ProcessorAction1BasedOnAction1(Action1<Void, D> action) {
    this.action1 = action;
  }

  @Override
  public void process(D data) {
    action1.execute(data);
  }

  @Override
  public Action1<Void, D> wrappedAction() {
    return action1;
  }
}
