package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action6;
import tech.intellispaces.actions.wrapper.WrapperAction1;

class ProcessorAction1BasedOnAction6<D> extends AbstractProcessorAction1<D> implements WrapperAction1<Void, D> {
  private final Action6<Void, D, Void, Void, Void, Void, Void> action6;

  ProcessorAction1BasedOnAction6(Action6<Void, D, Void, Void, Void, Void, Void> action6) {
    this.action6 = action6;
  }

  @Override
  public void process(D data) {
    action6.execute(data, null, null, null, null, null);
  }

  @Override
  public Action6<Void, D, Void, Void, Void, Void, Void> wrappedAction() {
    return action6;
  }
}
