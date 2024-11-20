package tech.intellispaces.action.processor;

import tech.intellispaces.action.Action;
import tech.intellispaces.action.wrapper.WrapperAction;

class ProcessorActionBasedOnGeneralAction extends AbstractProcessorAction implements WrapperAction {
  private final Action action;

  ProcessorActionBasedOnGeneralAction(Action action) {
    this.action = action;
  }

  @Override
  public int order() {
    return action.order();
  }

  @Override
  public void process(Object... inputData) {
    action.execute(inputData);
  }

  @Override
  public Action wrappedAction() {
    return action;
  }
}
