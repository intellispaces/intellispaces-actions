package tech.intellispaces.action.delegate;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Action2;
import tech.intellispaces.action.Action3;
import tech.intellispaces.action.Action4;
import tech.intellispaces.action.Action5;
import tech.intellispaces.action.supplier.SupplierAction;

/**
 * Provider of delegate actions.
 */
public interface DelegateActions {

  static <R> Delegate0<R> delegateAction0(SupplierAction<Action0<R>> broker) {
    return new Delegate0<>(broker);
  }

  static <R, D> Delegate1<R, D> delegateAction1(SupplierAction<Action1<R, D>> broker) {
    return new Delegate1<>(broker);
  }

  static <R, D1, D2> Delegate2<R, D1, D2> delegateAction2(SupplierAction<Action2<R, D1, D2>> broker) {
    return new Delegate2<>(broker);
  }

  static <R, D1, D2, D3> Delegate3<R, D1, D2, D3> delegateAction3(
      SupplierAction<Action3<R, D1, D2, D3>> broker
  ) {
    return new Delegate3<>(broker);
  }

  static <R, D1, D2, D3, D4> Delegate4<R, D1, D2, D3, D4> delegateAction4(
      SupplierAction<Action4<R, D1, D2, D3, D4>> broker
  ) {
    return new Delegate4<>(broker);
  }

  static <R, D1, D2, D3, D4, D5> Delegate5<R, D1, D2, D3, D4, D5> delegateAction5(
      SupplierAction<Action5<R, D1, D2, D3, D4, D5>> broker
  ) {
    return new Delegate5<>(broker);
  }
}
