package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Executor;
import tech.intellispaces.actions.multi.MultiActions;

import java.util.function.Function;

abstract class AbstractExecutor implements Executor {

  @Override
  public Executor then(Action0<Void> otherAction) {
    return new ExecutorWrapper(MultiActions.of(this, otherAction));
  }

  @Override
  public <A extends Action<_V, _D1, _D2, _D3, _D4, _D5>, _V, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action<Void, Void, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public Executor wrap(
      Function<Action<Void, Void, Void, Void, Void, Void>, Action<Void, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction(ExecutorWrapper::new);
  }
}
