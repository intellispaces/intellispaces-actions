package intellispaces.actions.processor;

import intellispaces.actions.Action1;
import intellispaces.actions.wrapper.Wrapper1;

class Processor1BasedOnAction1<D> extends AbstractProcessor1<D> implements Wrapper1<D, D> {
  private final Action1<D, D> wrappedAction;

  Processor1BasedOnAction1(Action1<D, D> action) {
    this.wrappedAction = action;
  }

  @Override
  public void process(D data) {
    wrappedAction.execute(data);
  }

  @Override
  public Action1<D, D> wrappedAction() {
    return wrappedAction;
  }
}
