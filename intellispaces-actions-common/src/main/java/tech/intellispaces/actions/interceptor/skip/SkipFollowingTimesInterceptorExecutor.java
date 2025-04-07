package tech.intellispaces.actions.interceptor.skip;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

class SkipFollowingTimesInterceptorExecutor<R> {
  private final R defaultResult;
  private boolean first = true;

  SkipFollowingTimesInterceptorExecutor(R defaultResult) {
    this.defaultResult = defaultResult;
  }

  R execute(Supplier<R> resultSuppler) {
    if (first) {
      first = false;
      return resultSuppler.get();
    }
    return defaultResult;
  }

  int executeReturnInt(IntSupplier resultSupplier) {
    if (first) {
      first = false;
      return resultSupplier.getAsInt();
    }
    return (int) defaultResult;
  }

  double executeReturnDouble(DoubleSupplier resultSupplier) {
    if (first) {
      first = false;
      return resultSupplier.getAsDouble();
    }
    return (double) defaultResult;
  }
}
