package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action1;
import tech.intellispaces.action.broker.BrokerAction1;

public interface DelegateAction1<R, D> extends Action1<R, D> {

  BrokerAction1<R, D> broker();
}
