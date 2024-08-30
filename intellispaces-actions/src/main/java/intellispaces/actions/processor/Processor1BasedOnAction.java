package intellispaces.actions.processor;

import intellispaces.actions.Action;
import intellispaces.actions.wrapper.Wrapper;

class Processor1BasedOnAction<D> extends AbstractProcessor1<D> implements Wrapper {
  private final Action wrappedAction;

  Processor1BasedOnAction(Action action) {
    this.wrappedAction = action;
  }

  @Override
  public void process(D data) {
    wrappedAction.execute(new Object[] { data });
  }

  @Override
  public Action wrappedAction() {
    return wrappedAction;
  }
}
