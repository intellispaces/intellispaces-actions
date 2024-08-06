package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Action5;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Processor action.
 *
 * <p>Processor is action that processes an input data.
 *
 * @param <D> processed data type.
 */
public interface Processor1<D> extends Action1<D, D>, Consumer<D> {

  /**
   * Executes action.
   *
   * @param data input data.
   */
  void process(D data);

  Processor1<D> then(Action1<D, D> otherAction);

  @Override
  default D execute(D value) {
    process(value);
    return value;
  }

  @Override
  default D execute(D data1, Void data2) {
    return execute(data1);
  }

  @Override
  default D execute(D data1, Void data2, Void data3) {
    return execute(data1);
  }

  @Override
  default D execute(D data1, Void data2, Void data3, Void data4) {
    return execute(data1);
  }

  @Override
  default void accept(D value) {
    process(value);
  }

  Processor1<D> wrap(
      Function<Action5<D, D, Void, Void, Void, Void>, Action5<D, D, Void, Void, Void, Void>> wrapperFactory
  );
}
