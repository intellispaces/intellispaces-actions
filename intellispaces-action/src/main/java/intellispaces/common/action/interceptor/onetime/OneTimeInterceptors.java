package intellispaces.common.action.interceptor.onetime;

import intellispaces.common.action.Action0;
import intellispaces.common.action.Action5;
import intellispaces.common.action.wrapper.WrapperAction0;
import intellispaces.common.action.wrapper.WrapperAction5;

import java.util.function.Function;

public interface OneTimeInterceptors {

  static <R> Function<Action0<R>, WrapperAction0<R>> firstTimeInterceptorFactory0() {
    return FirstTimeInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, WrapperAction5<R, D1, D2, D3, D4, D5>> firstTimeInterceptorFactory5() {
    return FirstTimeInterceptor5::new;
  }

  static <R> Function<Action0<R>, WrapperAction0<R>> cachedFirstTimeInterceptorFactory0() {
    return CachedFirstTimeInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, Action5<R, D1, D2, D3, D4, D5>> cachedFirstTimeInterceptorFactory5() {
    return CachedFirstTimeInterceptor5::new;
  }
}
