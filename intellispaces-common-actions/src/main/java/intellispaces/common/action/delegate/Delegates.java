package intellispaces.common.action.delegate;

import intellispaces.common.action.Action2;
import intellispaces.common.action.Action3;
import intellispaces.common.action.Action4;
import intellispaces.common.action.Action0;
import intellispaces.common.action.Action1;
import intellispaces.common.action.Action5;
import intellispaces.common.action.getter.Getter;

public interface Delegates {

  static <R> Delegate0<R> delegate0(Getter<Action0<R>> contractor) {
    return new Delegate0Impl<>(contractor);
  }

  static <R, D> Delegate1<R, D> delegate1(Getter<Action1<R, D>> contractor) {
    return new Delegate1Impl<>(contractor);
  }

  static <R, D1, D2> Delegate2<R, D1, D2> delegate2(Getter<Action2<R, D1, D2>> contractor) {
    return new Delegate2Impl<>(contractor);
  }

  static <R, D1, D2, D3> Delegate3<R, D1, D2, D3> delegate3(Getter<Action3<R, D1, D2, D3>> contractor) {
    return new Delegate3Impl<>(contractor);
  }

  static <R, D1, D2, D3, D4> Delegate4<R, D1, D2, D3, D4> delegate4(Getter<Action4<R, D1, D2, D3, D4>> contractor) {
    return new Delegate4Impl<>(contractor);
  }

  static <R, D1, D2, D3, D4, D5> Delegate5<R, D1, D2, D3, D4, D5> delegate5(Getter<Action5<R, D1, D2, D3, D4, D5>> contractor) {
    return new Delegate5Impl<>(contractor);
  }
}
