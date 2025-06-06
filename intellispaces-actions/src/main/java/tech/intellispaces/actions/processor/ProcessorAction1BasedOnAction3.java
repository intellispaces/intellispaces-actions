package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.wrapper.WrapperAction1;

class ProcessorAction1BasedOnAction3<D> extends AbstractProcessorAction1<D> implements WrapperAction1<Void, D> {
  private final Action3<Void, D, Void, Void> action3;

  ProcessorAction1BasedOnAction3(Action3<Void, D, Void, Void> action3) {
    this.action3 = action3;
  }

  @Override
  public void process(D data) {
    action3.execute(data, null, null);
  }

  @Override
  public Action3<Void, D, Void, Void> wrappedAction() {
    return action3;
  }
}
