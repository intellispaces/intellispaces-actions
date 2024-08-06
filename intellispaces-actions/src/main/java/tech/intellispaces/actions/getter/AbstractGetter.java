package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.Action5;

import java.util.function.Function;

abstract class AbstractGetter<V> implements Getter<V> {

  @Override
  public <A extends Action5<_V, _D1, _D2, _D3, _D4, _D5>, _V, _D1, _D2, _D3, _D4, _D5> A wrapAction(
      Function<Action5<V, Void, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public Getter<V> wrap(
      Function<Action5<V, Void, Void, Void, Void, Void>, Action5<V, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction(GetterWrapper::new);
  }
}
