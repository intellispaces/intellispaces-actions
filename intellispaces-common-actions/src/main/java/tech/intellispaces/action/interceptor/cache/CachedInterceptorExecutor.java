package tech.intellispaces.action.interceptor.cache;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

class CachedInterceptorExecutor<R> {
  private R cachedValue = null;
  private int cachedIntValue;
  private double cachedDoubleValue;

  private boolean isCachedValue = false;
  private boolean isCachedIntValue = false;
  private boolean isCachedDoubleValue = false;

  @SuppressWarnings("unchecked")
  R execute(Supplier<R> resultSuppler) {
    if (isCachedValue) {
      return cachedValue;
    }
    if (isCachedIntValue) {
      cachedValue = (R) Integer.valueOf(cachedIntValue);
    } else if (isCachedDoubleValue) {
      cachedValue = (R) Double.valueOf(cachedDoubleValue);
    } else {
      cachedValue = resultSuppler.get();
    }
    isCachedValue = true;
    return cachedValue;
  }

  int executeReturnInt(IntSupplier resultSupplier) {
    if (isCachedIntValue) {
      return cachedIntValue;
    }
    if (isCachedValue) {
      cachedIntValue = (Integer) cachedValue;
      isCachedIntValue = true;
    }
    cachedIntValue = resultSupplier.getAsInt();
    isCachedIntValue = true;
    return cachedIntValue;
  }

  double executeReturnDouble(DoubleSupplier resultSupplier) {
    if (isCachedDoubleValue) {
      return cachedDoubleValue;
    }
    if (isCachedValue) {
      cachedDoubleValue = (Double) cachedValue;
      isCachedDoubleValue = true;
    }
    cachedDoubleValue = resultSupplier.getAsDouble();
    isCachedDoubleValue = true;
    return cachedDoubleValue;
  }
}
