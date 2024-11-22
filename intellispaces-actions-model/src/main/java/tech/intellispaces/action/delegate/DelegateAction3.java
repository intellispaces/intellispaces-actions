package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action3;
import tech.intellispaces.action.broker.BrokerAction3;

public interface DelegateAction3<R, D1, D2, D3> extends Action3<R, D1, D2, D3> {

  BrokerAction3<R, D1, D2, D3> broker();
}
