package intellispaces.common.action.runner;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;
import intellispaces.common.action.Action5;
import intellispaces.common.action.multiaction.MultiActions;
import intellispaces.common.action.wrapper.WrapperAction0;
import intellispaces.common.action.wrapper.WrapperAction5;

import java.util.function.Function;

abstract class AbstractRunner extends AbstractAction0<Void> implements Runner {

  @Override
  public Runner then(Action0<Void> otherAction) {
    return new RunnerBasedOnAction5(MultiActions.of(this, otherAction));
  }

  @Override
  public Runner wrapAction0AsRunner(Function<Action0<Void>, WrapperAction0<Void>> wrapperFactory) {
    return wrapperFactory.apply(this).wrapAction0(RunnerBasedOnAction0::new);
  }

  @Override
  public Runner wrapAction5AsRunner(
      Function<Action5<Void, Void, Void, Void, Void, Void>, WrapperAction5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction5(RunnerBasedOnAction5::new);
  }
}
