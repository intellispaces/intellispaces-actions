package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action4;
import tech.intellispaces.action.broker.BrokerAction4;

public interface DelegateAction4<R, D1, D2, D3, D4> extends Action4<R, D1, D2, D3, D4> {

  BrokerAction4<R, D1, D2, D3, D4> broker();
}
