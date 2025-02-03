package tech.intellispaces.commons.action.delegate;

import tech.intellispaces.commons.action.Action3;
import tech.intellispaces.commons.action.broker.BrokerAction3;

public interface DelegateAction3<R, D1, D2, D3> extends Action3<R, D1, D2, D3> {

  BrokerAction3<R, D1, D2, D3> broker();
}
