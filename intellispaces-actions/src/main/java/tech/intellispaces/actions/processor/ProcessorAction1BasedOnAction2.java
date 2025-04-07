package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.wrapper.WrapperAction1;

class ProcessorAction1BasedOnAction2<D> extends AbstractProcessorAction1<D> implements WrapperAction1<Void, D> {
  private final Action2<Void, D, Void> action2;

  ProcessorAction1BasedOnAction2(Action2<Void, D, Void> action2) {
    this.action2 = action2;
  }

  @Override
  public void process(D data) {
    action2.execute(data, null);
  }

  @Override
  public Action2<Void, D, Void> wrappedAction() {
    return action2;
  }
}
