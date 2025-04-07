package tech.intellispaces.actions.interceptor.cache;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.wrapper.WrapperAction0;

import java.util.function.Function;

/**
 * Provider of cache interceptors.
 */
public interface CacheInterceptors {

  static <R> Function<Action0<R>, WrapperAction0<R>> cacheInterceptorFactory0() {
    return CachedInterceptor0::new;
  }
}

