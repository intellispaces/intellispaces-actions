package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.wrapper.Wrapper;

class Processor1BasedOnAction<D> extends AbstractProcessor1<D> implements Wrapper {
  private final Action wrappedAction;

  Processor1BasedOnAction(Action action) {
    this.wrappedAction = action;
  }

  @Override
  public void process(D data) {
    wrappedAction.execute(data);
  }

  @Override
  public Action wrappedAction() {
    return wrappedAction;
  }
}
