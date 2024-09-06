package intellispaces.common.action.processor;

import intellispaces.common.action.Action5;

class Processor1BasedOnAction5<D> extends AbstractProcessor1<D> {
  private final Action5<D, D, Void, Void, Void, Void> action;

  Processor1BasedOnAction5(Action5<D, D, Void, Void, Void, Void> action) {
    this.action = action;
  }

  @Override
  public void process(D data) {
    action.execute(data, null, null, null, null);
  }
}
