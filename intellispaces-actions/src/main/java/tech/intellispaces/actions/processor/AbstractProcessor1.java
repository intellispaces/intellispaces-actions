package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.AbstractAction1;
import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.multi.MultiActions;

import java.util.function.Function;

abstract class AbstractProcessor1<D> extends AbstractAction1<D, D> implements Processor1<D> {

  @Override
  public Processor1<D> then(Action1<D, D> otherAction) {
    return new Processor1Wrapper<>(MultiActions.of(this, otherAction));
  }

  @Override
  public Processor1<D> wrap(
      Function<Action5<D, D, Void, Void, Void, Void>, Action5<D, D, Void, Void, Void, Void>> wrapperFactory
  ) {
    return this.wrapAction5(wrapperFactory).wrapAction5(Processor1Wrapper::new);
  }
}
