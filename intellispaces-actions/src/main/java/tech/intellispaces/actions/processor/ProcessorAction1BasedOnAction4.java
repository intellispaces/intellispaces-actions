package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.wrapper.WrapperAction1;

class ProcessorAction1BasedOnAction4<D> extends AbstractProcessorAction1<D> implements WrapperAction1<Void, D> {
  private final Action4<Void, D, Void, Void, Void> action4;

  ProcessorAction1BasedOnAction4(Action4<Void, D, Void, Void, Void> action4) {
    this.action4 = action4;
  }

  @Override
  public void process(D data) {
    action4.execute(data, null, null, null);
  }

  @Override
  public Action4<Void, D, Void, Void, Void> wrappedAction() {
    return action4;
  }
}
