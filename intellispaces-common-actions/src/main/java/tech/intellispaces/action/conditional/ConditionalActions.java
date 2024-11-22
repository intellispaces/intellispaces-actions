package tech.intellispaces.action.conditional;

import tech.intellispaces.action.Action1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Providers of conditional actions.
 */
public interface ConditionalActions {

  static <R, D> GetOrSetIfAbsentAction<R, D> getOrSetIfAbsentAction(Class<D> dataClass) {
    return GetOrSetIfAbsentActions.get(dataClass);
  }

  static <R, D> GetOrSetIfAbsentAction<R, D> getOrSetIfAbsentAction(Class<D> dataClass, Class<R> resultClass) {
    return GetOrSetIfAbsentActions.get(dataClass);
  }

  static <R, D> Action1<R, D> getOrSetIfAbsentAction(
      Class<D> dataClass,
      Function<D, R> getter,
      BiConsumer<D, R> setter,
      Supplier<R> supplier
  ) {
    return GetOrSetIfAbsentActions.get(dataClass, getter, setter, supplier);
  }
}
