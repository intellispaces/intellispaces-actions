package tech.intellispaces.framework.commons.action.processor;

import tech.intellispaces.framework.commons.action.Action;
import tech.intellispaces.framework.commons.action.Action1;
import tech.intellispaces.framework.commons.action.Processor1;
import tech.intellispaces.framework.commons.action.multi.MultiActions;

import java.util.function.Function;

abstract class AbstractProcessor1<D> implements Processor1<D> {

  @Override
  public Processor1<D> then(Action1<D, D> otherAction) {
    return new Processor1Wrapper<>(MultiActions.of(this, otherAction));
  }

  @Override
  public <A extends Action<_V, _D1, _D2, _D3, _D4, _D5>, _V, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action<D, D, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public Processor1<D> wrap(
      Function<Action<D, D, Void, Void, Void, Void>, Action<D, D, Void, Void, Void, Void>> wrapperFactory
  ) {
    return this.wrapAction(wrapperFactory).wrapAction(Processor1Wrapper::new);
  }
}
