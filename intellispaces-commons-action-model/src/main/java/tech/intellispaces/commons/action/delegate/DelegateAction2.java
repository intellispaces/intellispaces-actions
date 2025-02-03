package tech.intellispaces.commons.action.delegate;

import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.broker.BrokerAction2;

public interface DelegateAction2<R, D1, D2> extends Action2<R, D1, D2> {

  BrokerAction2<R, D1, D2> broker();
}
