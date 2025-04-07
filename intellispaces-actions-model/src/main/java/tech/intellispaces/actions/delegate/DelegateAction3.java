package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.broker.BrokerAction3;

public interface DelegateAction3<R, D1, D2, D3> extends Action3<R, D1, D2, D3> {

  BrokerAction3<R, D1, D2, D3> broker();
}
