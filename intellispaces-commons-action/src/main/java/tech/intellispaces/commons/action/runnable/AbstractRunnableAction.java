package tech.intellispaces.commons.action.runnable;

import tech.intellispaces.commons.action.AbstractAction0;
import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.chain.runnable.ChainRunnableActions;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

import java.util.function.Function;

public abstract class AbstractRunnableAction
    extends AbstractAction0<Void>
    implements RunnableAction
{
  @Override
  public Void execute() {
    run();
    return null;
  }

  @Override
  public RunnableAction andThen(Action0<Void> nextAction) {
    return new RunnableActionBasedOnAction0(ChainRunnableActions.get(this, nextAction));
  }

  @Override
  public <W extends WrapperAction0<Void>> RunnableAction wrapRunnableAction(
      Function<Action0<Void>, W> wrapperFactory
  ) {
    return new RunnableActionBasedOnAction0(wrapperFactory.apply(this));
  }
}
