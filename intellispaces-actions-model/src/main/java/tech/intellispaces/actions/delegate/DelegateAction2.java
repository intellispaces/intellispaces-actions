package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.broker.BrokerAction2;

public interface DelegateAction2<R, D1, D2> extends Action2<R, D1, D2> {

  BrokerAction2<R, D1, D2> broker();
}
