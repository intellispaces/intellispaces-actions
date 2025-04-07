package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.broker.BrokerAction0;

public interface DelegateAction0<R> extends Action0<R> {

  BrokerAction0<R> broker();
}
