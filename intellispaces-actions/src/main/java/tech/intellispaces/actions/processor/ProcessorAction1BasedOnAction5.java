package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.WrapperAction1;

class ProcessorAction1BasedOnAction5<D> extends AbstractProcessorAction1<D> implements WrapperAction1<Void, D> {
  private final Action5<Void, D, Void, Void, Void, Void> action5;

  ProcessorAction1BasedOnAction5(Action5<Void, D, Void, Void, Void, Void> action5) {
    this.action5 = action5;
  }

  @Override
  public void process(D data) {
    action5.execute(data, null, null, null, null);
  }

  @Override
  public Action5<Void, D, Void, Void, Void, Void> wrappedAction() {
    return action5;
  }
}
