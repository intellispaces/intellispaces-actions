package tech.intellispaces.commons.action.processor;

import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.wrapper.WrapperAction1;

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
