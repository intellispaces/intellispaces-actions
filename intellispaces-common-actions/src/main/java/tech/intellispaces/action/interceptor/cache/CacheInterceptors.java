package tech.intellispaces.action.interceptor.cache;

import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Action5;
import tech.intellispaces.action.wrapper.WrapperAction0;

import java.util.function.Function;

/**
 * Provider of cache interceptors.
 */
public interface CacheInterceptors {

  static <R> Function<Action0<R>, WrapperAction0<R>> cacheInterceptorFactory0() {
    return CachedInterceptor0::new;
  }

  static <R, D1, D2, D3, D4, D5> Function<Action5<R, D1, D2, D3, D4, D5>, Action5<R, D1, D2, D3, D4, D5>> cacheInterceptorFactory5() {
    return CachedInterceptor5::new;
  }
}

