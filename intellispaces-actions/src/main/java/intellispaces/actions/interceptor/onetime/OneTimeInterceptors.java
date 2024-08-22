package intellispaces.actions.interceptor.onetime;

import intellispaces.actions.wrapper.Wrapper0;
import intellispaces.actions.Action0;
import intellispaces.actions.Action5;
import intellispaces.actions.wrapper.Wrapper5;

import java.util.function.Function;

public interface OneTimeInterceptors {

  static <R> Function<Action0<R>, Wrapper0<R>> firstTimeInterceptorFactory0() {
    return FirstTimeInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, Wrapper5<R, D1, D2, D3, D4, D5>> firstTimeInterceptorFactory5() {
    return FirstTimeInterceptor5::new;
  }

  static <R> Function<Action0<R>, Wrapper0<R>> cachedFirstTimeInterceptorFactory0() {
    return CachedFirstTimeInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, Action5<R, D1, D2, D3, D4, D5>> cachedFirstTimeInterceptorFactory5() {
    return CachedFirstTimeInterceptor5::new;
  }
}
