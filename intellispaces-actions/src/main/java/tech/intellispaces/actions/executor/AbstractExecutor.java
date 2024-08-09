package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.multi.MultiActions;

import java.util.function.Function;

abstract class AbstractExecutor extends AbstractAction0<Void> implements Executor {

  @Override
  public Executor then(Action0<Void> otherAction) {
    return new ExecutorWrapper(MultiActions.of(this, otherAction));
  }

  @Override
  public Executor wrap(
      Function<Action5<Void, Void, Void, Void, Void, Void>, Action5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction5(ExecutorWrapper::new);
  }
}
