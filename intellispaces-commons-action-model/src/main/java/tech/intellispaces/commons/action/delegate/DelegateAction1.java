package tech.intellispaces.commons.action.delegate;

import tech.intellispaces.commons.action.Action1;
import tech.intellispaces.commons.action.broker.BrokerAction1;

public interface DelegateAction1<R, D> extends Action1<R, D> {

  BrokerAction1<R, D> broker();
}
