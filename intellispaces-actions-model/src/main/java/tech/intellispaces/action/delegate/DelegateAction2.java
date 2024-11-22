package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action2;
import tech.intellispaces.action.broker.BrokerAction2;

public interface DelegateAction2<R, D1, D2> extends Action2<R, D1, D2> {

  BrokerAction2<R, D1, D2> broker();
}
