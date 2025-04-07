package tech.intellispaces.actions.interceptor.skip;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.WrapperAction;
import tech.intellispaces.actions.wrapper.WrapperAction0;
import tech.intellispaces.actions.wrapper.WrapperAction1;
import tech.intellispaces.actions.wrapper.WrapperAction5;
import tech.intellispaces.commons.exception.NotImplementedExceptions;

import java.util.function.Function;

/**
 * Provider of skipping interceptors.
 */
public interface SkipInterceptors {

  static WrapperAction skipFirstTimeInterceptor(Action interceptedAction) {
    return switch (interceptedAction.order()) {
      case 0 -> skipFirstTimeInterceptor0((Action0<?>) interceptedAction);
      case 1 -> skipFirstTimeInterceptor1((Action1<?, ?>) interceptedAction);
      default -> throw NotImplementedExceptions.withCode("56RgQw");
    };
  }

  static <R> WrapperAction0<R> skipFirstTimeInterceptor0(Action0<R> interceptedAction) {
    return new SkipFirstTimeInterceptor0<>(interceptedAction);
  }

  static <R, D> WrapperAction1<R, D> skipFirstTimeInterceptor1(Action1<R, D> interceptedAction) {
    return new SkipFirstTimeInterceptor1<>(interceptedAction);
  }

  static Function<Action, WrapperAction> skipFirstTimeInterceptorFactory() {
    return SkipInterceptors::skipFirstTimeInterceptor;
  }

  static <R> Function<Action0<R>, WrapperAction0<R>> skipFirstTimeInterceptorFactory0() {
    return SkipInterceptors::skipFirstTimeInterceptor0;
  }

  static <R, D> Function<Action1<R, D>, WrapperAction1<R, D>> skipFirstTimeInterceptorFactory1() {
    return SkipInterceptors::skipFirstTimeInterceptor1;
  }

  static <R> Function<Action0<R>, WrapperAction0<R>> skipFollowingTimesInterceptorFactory0() {
    return SkipFollowingTimesInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, WrapperAction5<R, D1, D2, D3, D4, D5>>
  skipFollowingTimesInterceptorFactory5() {
    return SkipFollowingTimesInterceptor5::new;
  }
}

