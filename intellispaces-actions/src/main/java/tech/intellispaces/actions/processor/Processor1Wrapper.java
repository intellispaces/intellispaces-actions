package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action;

class Processor1Wrapper<D> extends AbstractProcessor1<D> {
  private final Action<D, D, Void, Void, Void, Void> action;

  Processor1Wrapper(Action<D, D, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public void process(D data) {
    action.execute(data, null, null, null, null);
  }
}
