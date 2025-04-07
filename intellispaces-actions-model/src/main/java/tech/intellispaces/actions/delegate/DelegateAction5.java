package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.broker.BrokerAction5;

public interface DelegateAction5<R, D1, D2, D3, D4, D5> extends Action5<R, D1, D2, D3, D4, D5> {

  BrokerAction5<R, D1, D2, D3, D4, D5> broker();
}
