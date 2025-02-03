package tech.intellispaces.commons.action.delegate;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.broker.BrokerAction0;

public interface DelegateAction0<R> extends Action0<R> {

  BrokerAction0<R> broker();
}
