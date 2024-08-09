package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

abstract class AbstractGetter<R> extends AbstractAction0<R> implements Getter<R> {

  @Override
  public Getter<R> wrap(
      Function<Action5<R, Void, Void, Void, Void, Void>, Action5<R, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction5(GetterWrapper::new);
  }
}
