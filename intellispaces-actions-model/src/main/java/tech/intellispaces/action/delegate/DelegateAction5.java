package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action5;
import tech.intellispaces.action.broker.BrokerAction5;

public interface DelegateAction5<R, D1, D2, D3, D4, D5> extends Action5<R, D1, D2, D3, D4, D5> {

  BrokerAction5<R, D1, D2, D3, D4, D5> broker();
}
