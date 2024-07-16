package tech.intellispaces.framework.commons.action.handler;

import tech.intellispaces.framework.commons.action.Action;
import tech.intellispaces.framework.commons.action.Action1;
import tech.intellispaces.framework.commons.action.Handler1;
import tech.intellispaces.framework.commons.action.multi.MultiAction;

import java.util.function.Function;

abstract class AbstractHandler1<D> implements Handler1<D> {

  @Override
  public Handler1<D> then(Action1<D, D> otherAction) {
    return new Handler1Wrapper<>(new MultiAction<>(this, otherAction));
  }

  @Override
  public <A extends Action<_V, _D1, _D2, _D3, _D4, _D5>, _V, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action<D, D, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public Handler1<D> wrap(
      Function<Action<D, D, Void, Void, Void, Void>, Action<D, D, Void, Void, Void, Void>> wrapperFactory
  ) {
    return this.wrapAction(wrapperFactory).wrapAction(Handler1Wrapper::new);
  }
}
