package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.multiaction.MultiActions;
import tech.intellispaces.actions.wrapper.Wrapper0;
import tech.intellispaces.actions.wrapper.Wrapper5;

import java.util.function.Function;

abstract class AbstractExecutor extends AbstractAction0<Void> implements Executor {

  @Override
  public Executor then(Action0<Void> otherAction) {
    return new ExecutorBasedOnAction5(MultiActions.of(this, otherAction));
  }

  @Override
  public Executor wrapAction0AsExecutor(Function<Action0<Void>, Wrapper0<Void>> wrapperFactory) {
    return wrapperFactory.apply(this).wrapAction0(ExecutorBasedOnAction0::new);
  }

  @Override
  public Executor wrapAction5AsExecutor(
      Function<Action5<Void, Void, Void, Void, Void, Void>, Wrapper5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction5(ExecutorBasedOnAction5::new);
  }
}
