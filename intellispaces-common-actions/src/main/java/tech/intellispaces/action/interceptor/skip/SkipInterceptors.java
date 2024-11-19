package tech.intellispaces.action.interceptor.skip;

import tech.intellispaces.action.Action;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Action5;
import tech.intellispaces.action.wrapper.WrapperAction;
import tech.intellispaces.action.wrapper.WrapperAction0;
import tech.intellispaces.action.wrapper.WrapperAction1;
import tech.intellispaces.action.wrapper.WrapperAction5;

import java.util.function.Function;

/**
 * Provider of skipping interceptors.
 */
public interface SkipInterceptors {

  static <R> Function<Action0<R>, WrapperAction0<R>> firstTimeInterceptorFactory0() {
    return FirstTimeInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, WrapperAction5<R, D1, D2, D3, D4, D5>> firstTimeInterceptorFactory5() {
    return FirstTimeInterceptor5::new;
  }

  static WrapperAction skipFirstTimeInterceptor(Action interceptedAction) {
    return new SkipFirstTimeInterceptor(interceptedAction);
  }

  static <R, D> WrapperAction1<R, D> skipFirstTimeInterceptor1(Action1<R, D> interceptedAction) {
    return new SkipFirstTimeInterceptor1<>(interceptedAction);
  }

  static Function<Action, WrapperAction> skipFirstTimeInterceptorFactory() {
    return SkipFirstTimeInterceptor::new;
  }

  static <R> Function<Action0<R>, WrapperAction0<R>> skipFirstTimeInterceptorFactory0() {
    return SkipFirstTimeInterceptor0::new;
  }

  static <R, D> Function<Action1<R, D>, WrapperAction1<R, D>> skipFirstTimeInterceptorFactory1() {
    return SkipFirstTimeInterceptor1::new;
  }
}

