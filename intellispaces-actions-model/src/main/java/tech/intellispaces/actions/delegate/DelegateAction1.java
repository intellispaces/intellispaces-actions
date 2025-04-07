package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.broker.BrokerAction1;

public interface DelegateAction1<R, D> extends Action1<R, D> {

  BrokerAction1<R, D> broker();
}
