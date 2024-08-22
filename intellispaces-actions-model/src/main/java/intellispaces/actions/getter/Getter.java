package intellispaces.actions.getter;

import intellispaces.actions.Action5;
import intellispaces.actions.wrapper.Wrapper0;
import intellispaces.actions.Action0;
import intellispaces.actions.wrapper.Wrapper5;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Getter action.<p/>
 *
 * Getter is action that returns a data only.
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

  Getter<R> wrapAction0AsGetter(Function<Action0<R>, Wrapper0<R>> wrapperFactory);

  Getter<R> wrapAction5AsGetter(
      Function<Action5<R, Void, Void, Void, Void, Void>, Wrapper5<R, Void, Void, Void, Void, Void>> wrapperFactory
  );
}
