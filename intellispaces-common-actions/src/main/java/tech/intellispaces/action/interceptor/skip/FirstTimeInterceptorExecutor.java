package tech.intellispaces.action.interceptor.skip;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

class FirstTimeInterceptorExecutor<R> {
  private boolean first = true;

  R execute(Supplier<R> resultSuppler) {
    R result = null;
    if (first) {
      result = resultSuppler.get();
    }
    first = false;
    return result;
  }

  int executeReturnInt(IntSupplier resultSupplier) {
    int result = 0;
    if (first) {
      result = resultSupplier.getAsInt();
    }
    first = false;
    return result;
  }

  double executeReturnDouble(DoubleSupplier resultSupplier) {
    double result = 0;
    if (first) {
      result = resultSupplier.getAsDouble();
    }
    first = false;
    return result;
  }
}
