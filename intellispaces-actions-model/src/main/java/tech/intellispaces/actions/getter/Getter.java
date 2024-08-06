package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Getter action.
 *
 * <p>Getter is action that returns a data.
 *
 * @param <R> result data type.
 */
public interface Getter<R> extends Action0<R>, Supplier<R> {

  @Override
  default R execute() {
    return get();
  }

  @Override
  default R execute(Void data1, Void data2, Void data3, Void data4, Void data5) {
    return execute();
  }

  @Override
  default R execute(Void data) {
    return execute();
  }

  @Override
  default R execute(Void data1, Void data2) {
    return execute();
  }

  @Override
  default R execute(Void data1, Void data2, Void data3) {
    return execute();
  }

  @Override
  default R execute(Void data1, Void data2, Void data3, Void data4) {
    return execute();
  }

  Getter<R> wrap(
      Function<Action5<R, Void, Void, Void, Void, Void>, Action5<R, Void, Void, Void, Void, Void>> wrapperFactory
  );
}
