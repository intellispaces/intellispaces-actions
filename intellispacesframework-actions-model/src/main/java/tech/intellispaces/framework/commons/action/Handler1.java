package tech.intellispaces.framework.commons.action;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Handler action.
 *
 * <p>Handler is action that processes an input data.
 *
 * @param <D> handled data type.
 */
public interface Handler1<D> extends Action1<D, D>, Consumer<D> {

  /**
   * Executes action.
   *
   * @param data input data.
   */
  void handle(D data);

  Handler1<D> then(Action1<D, D> otherAction);

  @Override
  default D execute(D value) {
    handle(value);
    return value;
  }

  @Override
  default void accept(D value) {
    handle(value);
  }

  Handler1<D> wrap(
      Function<Action<D, D, Void, Void, Void, Void>, Action<D, D, Void, Void, Void, Void>> wrapperFactory
  );
}
