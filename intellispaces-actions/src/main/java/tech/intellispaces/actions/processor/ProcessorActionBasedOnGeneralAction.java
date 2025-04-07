package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.wrapper.WrapperAction;

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
  public void process(Object[] inputs) {
    action.execute(inputs);
  }

  @Override
  public Action wrappedAction() {
    return action;
  }
}
