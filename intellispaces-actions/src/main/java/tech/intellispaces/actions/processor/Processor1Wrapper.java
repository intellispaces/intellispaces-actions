package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action5;

class Processor1Wrapper<D> extends AbstractProcessor1<D> {
  private final Action5<D, D, Void, Void, Void, Void> action;

  Processor1Wrapper(Action5<D, D, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public void process(D data) {
    action.execute(data, null, null, null, null);
  }
}
