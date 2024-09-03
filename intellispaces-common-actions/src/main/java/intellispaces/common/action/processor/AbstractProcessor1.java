package intellispaces.common.action.processor;

import intellispaces.common.action.wrapper.Wrapper;
import intellispaces.common.action.wrapper.Wrapper1;
import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.Action;
import intellispaces.common.action.Action1;
import intellispaces.common.action.multiaction.MultiActions;

import java.util.function.Function;

public abstract class AbstractProcessor1<D> extends AbstractAction1<D, D> implements Processor1<D> {

  @Override
  public Processor1<D> then(Action1<D, D> otherAction) {
    return new Processor1BasedOnAction5<>(MultiActions.of(this, otherAction));
  }

  @Override
  public Processor1<D> wrapActionAsProcessor(Function<Action, Wrapper> wrapperFactory) {
    return this.wrapAction(wrapperFactory).wrapAction(Processor1BasedOnAction::new);
  }

  @Override
  public Processor1<D> wrapAction1AsProcessor(Function<Action1<D, D>, Wrapper1<D, D>> wrapperFactory) {
    return wrapperFactory.apply(this).wrapAction1(Processor1BasedOnAction1::new);
  }
}