package tech.intellispaces.action.interceptor.skip;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

class SkipFirstTimeInterceptorExecutor<R> {
  private final R defaultResult;
  private boolean first = true;

  SkipFirstTimeInterceptorExecutor(R defaultResult) {
    this.defaultResult = defaultResult;
  }

  R execute(Supplier<R> resultSuppler) {
    if (first) {
      first = false;
      return defaultResult;
    }
    return resultSuppler.get();
  }

  int executeReturnInt(IntSupplier resultSupplier) {
    if (first) {
      first = false;
      return (int) defaultResult;
    }
    return resultSupplier.getAsInt();
  }

  double executeReturnDouble(DoubleSupplier resultSupplier) {
    if (first) {
      first = false;
      return (double) defaultResult;
    }
    return resultSupplier.getAsDouble();
  }
}
