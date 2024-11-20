package tech.intellispaces.action.processor;

import tech.intellispaces.action.AbstractAction;
import tech.intellispaces.action.Action;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.chain.processor.ChainProcessorActions;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction;

import java.util.function.Function;

public abstract class AbstractProcessorAction extends AbstractAction implements ProcessorAction {

  @Override
  public Object execute(Object... inputData) {
    process(inputData);
    return null;
  }

  @Override
  public int executeReturnInt(Object... inputData) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(Object... inputData) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ProcessorAction then(Action nextAction) {
    return new ProcessorActionBasedOnGeneralAction(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(Object... inputData) {
    return Actions.runnableAction(this::process, inputData);
  }

  @Override
  public <W extends WrapperAction> ProcessorAction wrapProcessorAction(
      Function<Action, W> wrapperFactory
  ) {
    return new ProcessorActionBasedOnGeneralAction(wrapperFactory.apply(this));
  }
}
