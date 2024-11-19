package tech.intellispaces.action.conditional;

import tech.intellispaces.action.Action1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Providers of conditional actions.
 */
public interface ConditionalActions {

  static <R, D> GetAndSetIfAbsentAction<R, D> getAndSetIfAbsentAction(Class<D> dataClass) {
    return GetAndSetIfAbsentActions.get(dataClass);
  }

  static <R, D> Action1<R, D> getAndSetIfAbsentAction(
      Class<D> dataClass,
      Function<D, R> getter,
      BiConsumer<D, R> setter,
      Supplier<R> supplier
  ) {
    return GetAndSetIfAbsentActions.get(dataClass, getter, setter, supplier);
  }
}
