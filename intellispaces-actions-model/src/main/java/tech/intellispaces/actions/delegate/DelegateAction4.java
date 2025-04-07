package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.broker.BrokerAction4;

public interface DelegateAction4<R, D1, D2, D3, D4> extends Action4<R, D1, D2, D3, D4> {

  BrokerAction4<R, D1, D2, D3, D4> broker();
}
