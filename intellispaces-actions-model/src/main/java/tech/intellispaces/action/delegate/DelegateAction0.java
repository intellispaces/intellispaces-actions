package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.broker.BrokerAction0;

public interface DelegateAction0<R> extends Action0<R> {

  BrokerAction0<R> broker();
}
