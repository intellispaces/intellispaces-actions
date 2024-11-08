package intellispaces.common.action.interceptor.skipping;

import intellispaces.common.action.Action;
import intellispaces.common.action.Action0;
import intellispaces.common.action.Action1;
import intellispaces.common.action.wrapper.WrapperAction;
import intellispaces.common.action.wrapper.WrapperAction0;
import intellispaces.common.action.wrapper.WrapperAction1;

import java.util.function.Function;

public interface SkippingInterceptors {

  static WrapperAction skippingFirstTimeInterceptor(Action interceptedAction) {
    return new SkippingFirstTimeInterceptor(interceptedAction);
  }

  static <R, D> WrapperAction1<R, D> skippingFirstTimeInterceptor1(Action1<R, D> interceptedAction) {
    return new SkippingFirstTimeInterceptor1<>(interceptedAction);
  }

  static Function<Action, WrapperAction> skippingFirstTimeInterceptorFactory() {
    return SkippingFirstTimeInterceptor::new;
  }

  static <R> Function<Action0<R>, WrapperAction0<R>> skippingFirstTimeInterceptorFactory0() {
    return SkippingFirstTimeInterceptor0::new;
  }

  static <R, D> Function<Action1<R, D>, WrapperAction1<R, D>> skippingFirstTimeInterceptorFactory1() {
    return SkippingFirstTimeInterceptor1::new;
  }
}

