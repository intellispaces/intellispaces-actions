package tech.intellispaces.actions.runnable;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.chain.runnable.ChainRunnableActions;
import tech.intellispaces.actions.wrapper.WrapperAction0;

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
