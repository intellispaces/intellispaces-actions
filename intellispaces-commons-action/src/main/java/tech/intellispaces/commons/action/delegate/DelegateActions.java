package tech.intellispaces.commons.action.delegate;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.Action1;
import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.Action3;
import tech.intellispaces.commons.action.Action4;
import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.broker.BrokerAction0;
import tech.intellispaces.commons.action.broker.BrokerAction1;
import tech.intellispaces.commons.action.broker.BrokerAction2;
import tech.intellispaces.commons.action.broker.BrokerAction3;
import tech.intellispaces.commons.action.broker.BrokerAction4;
import tech.intellispaces.commons.action.broker.BrokerAction5;
import tech.intellispaces.commons.action.broker.BrokerActions;

import java.util.function.Supplier;

/**
 * Provider of delegate actions.
 */
public interface DelegateActions {

  static <R> DelegateAction0<R> delegateAction0(BrokerAction0<R> broker) {
    return new DelegateAction0Impl<>(broker);
  }

  static <R, D> DelegateAction1<R, D> delegateAction1(BrokerAction1<R, D> broker) {
    return new DelegateAction1Impl<>(broker);
  }

  static <R, D1, D2> DelegateAction2<R, D1, D2> delegateAction2(BrokerAction2<R, D1, D2> broker) {
    return new DelegateAction2Impl<>(broker);
  }

  static <R, D1, D2, D3> DelegateAction3<R, D1, D2, D3> delegateAction3(
      BrokerAction3<R, D1, D2, D3> broker
  ) {
    return new DelegateAction3Impl<>(broker);
  }

  static <R, D1, D2, D3, D4> DelegateAction4<R, D1, D2, D3, D4> delegateAction4(
      BrokerAction4<R, D1, D2, D3, D4> broker
  ) {
    return new DelegateAction4Impl<>(broker);
  }

  static <R, D1, D2, D3, D4, D5> DelegateAction5<R, D1, D2, D3, D4, D5> delegateAction5(
      BrokerAction5<R, D1, D2, D3, D4, D5> broker
  ) {
    return new DelegateAction5Impl<>(broker);
  }

  static <R> DelegateAction0<R> delegateAction0(Supplier<Action0<R>> contractorSupplier) {
    return delegateAction0(BrokerActions.brokerAction0(contractorSupplier));
  }

  static <R, D> DelegateAction1<R, D> delegateAction1(Supplier<Action1<R, D>> contractorSupplier) {
    return delegateAction1(BrokerActions.brokerAction1(contractorSupplier));
  }

  static <R, D1, D2> DelegateAction2<R, D1, D2> delegateAction2(Supplier<Action2<R, D1, D2>> contractorSupplier) {
    return delegateAction2(BrokerActions.brokerAction2(contractorSupplier));
  }

  static <R, D1, D2, D3> DelegateAction3<R, D1, D2, D3> delegateAction3(
      Supplier<Action3<R, D1, D2, D3>> contractorSupplier
  ) {
    return delegateAction3(BrokerActions.brokerAction3(contractorSupplier));
  }

  static <R, D1, D2, D3, D4> DelegateAction4<R, D1, D2, D3, D4> delegateAction4(
      Supplier<Action4<R, D1, D2, D3, D4>> contractorSupplier
  ) {
    return delegateAction4(BrokerActions.brokerAction4(contractorSupplier));
  }

  static <R, D1, D2, D3, D4, D5> DelegateAction5<R, D1, D2, D3, D4, D5> delegateAction5(
      Supplier<Action5<R, D1, D2, D3, D4, D5>> broker
  ) {
    return delegateAction5(BrokerActions.brokerAction5(broker));
  }
}
