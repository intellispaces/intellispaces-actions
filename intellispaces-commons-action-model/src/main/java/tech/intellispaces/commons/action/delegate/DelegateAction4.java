package tech.intellispaces.commons.action.delegate;

import tech.intellispaces.commons.action.Action4;
import tech.intellispaces.commons.action.broker.BrokerAction4;

public interface DelegateAction4<R, D1, D2, D3, D4> extends Action4<R, D1, D2, D3, D4> {

  BrokerAction4<R, D1, D2, D3, D4> broker();
}
