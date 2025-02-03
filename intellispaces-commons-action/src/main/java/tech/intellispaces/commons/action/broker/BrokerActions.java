package tech.intellispaces.commons.action.broker;

import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.Action1;
import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.Action3;
import tech.intellispaces.commons.action.Action4;
import tech.intellispaces.commons.action.Action5;

import java.util.function.Supplier;

/**
 * Broker actions provider.
 */
public interface BrokerActions {

  static <R> BrokerAction0<R> brokerAction0(Action0<R> contractor) {
    return new BrokerAction0BasedOnContractor<>(contractor);
  }

  static <R, D> BrokerAction1<R, D> brokerAction1(Action1<R, D> contractor) {
    return new BrokerAction1BasedOnContractor<>(contractor);
  }

  static <R, D1, D2> BrokerAction2<R, D1, D2> brokerAction2(Action2<R, D1, D2> contractor) {
    return new BrokerAction2BasedOnContractor<>(contractor);
  }

  static <R, D1, D2, D3> BrokerAction3<R, D1, D2, D3> brokerAction3(Action3<R, D1, D2, D3> contractor) {
    return new BrokerAction3BasedOnContractor<>(contractor);
  }

  static <R, D1, D2, D3, D4> BrokerAction4<R, D1, D2, D3, D4> brokerAction4(Action4<R, D1, D2, D3, D4> contractor) {
    return new BrokerAction4BasedOnContractor<>(contractor);
  }

  static <R, D1, D2, D3, D4, D5> BrokerAction5<R, D1, D2, D3, D4, D5> brokerAction5(
      Action5<R, D1, D2, D3, D4, D5> contractor
  ) {
    return new BrokerAction5BasedOnContractor<>(contractor);
  }

  static <R> BrokerAction0<R> brokerAction0(Supplier<Action0<R>> contractor) {
    return new BrokerAction0BasedOnSupplier<>(contractor);
  }

  static <R, D> BrokerAction1<R, D> brokerAction1(Supplier<Action1<R, D>> contractor) {
    return new BrokerAction1BasedOnSupplier<>(contractor);
  }

  static <R, D1, D2> BrokerAction2<R, D1, D2> brokerAction2(Supplier<Action2<R, D1, D2>> contractor) {
    return new BrokerAction2BasedOnSupplier<>(contractor);
  }

  static <R, D1, D2, D3> BrokerAction3<R, D1, D2, D3> brokerAction3(Supplier<Action3<R, D1, D2, D3>> contractor) {
    return new BrokerAction3BasedOnSupplier<>(contractor);
  }

  static <R, D1, D2, D3, D4> BrokerAction4<R, D1, D2, D3, D4> brokerAction4(
      Supplier<Action4<R, D1, D2, D3, D4>> contractor
  ) {
    return new BrokerAction4BasedOnSupplier<>(contractor);
  }

  static <R, D1, D2, D3, D4, D5> BrokerAction5<R, D1, D2, D3, D4, D5> brokerAction5(
      Supplier<Action5<R, D1, D2, D3, D4, D5>> contractor
  ) {
    return new BrokerAction5BasedOnSupplier<>(contractor);
  }
}
