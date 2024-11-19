package tech.intellispaces.action.conditional;

import tech.intellispaces.action.Action1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static tech.intellispaces.action.dataextractor.DataExtractors.direct;
import static tech.intellispaces.action.dataextractor.DataExtractors.predefined;

/**
 * Provider of the {@link GetAndSetIfAbsentAction} action.
 */
public class GetAndSetIfAbsentActions {

  @SuppressWarnings("unchecked")
  public static <R, D> GetAndSetIfAbsentAction<R, D> get(Class<D> dataClass) {
    return (GetAndSetIfAbsentAction<R, D>) INSTANCE;
  }

  public static <R, D> Action1<R, D> get(
      Class<D> dataClass,
      Function<D, R> getter,
      BiConsumer<D, R> setter,
      Supplier<R> supplier
  ) {
    GetAndSetIfAbsentAction<R, D> action = get(dataClass);
    return action.convertToAction1(
        direct(),
        predefined(getter),
        predefined(setter),
        predefined(supplier)
    );
  }

  private static final GetAndSetIfAbsentAction<?, ?> INSTANCE = new GetAndSetIfAbsentAction<>();

  private GetAndSetIfAbsentActions() {}
}
