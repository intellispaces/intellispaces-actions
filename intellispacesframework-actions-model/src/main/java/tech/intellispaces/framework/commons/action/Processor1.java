package tech.intellispaces.framework.commons.action;

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
  default void accept(D value) {
    process(value);
  }

  Processor1<D> wrap(
      Function<Action<D, D, Void, Void, Void, Void>, Action<D, D, Void, Void, Void, Void>> wrapperFactory
  );
}
