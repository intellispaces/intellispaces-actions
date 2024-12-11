package tech.intellispaces.action.conditional;

import tech.intellispaces.action.Action1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static tech.intellispaces.action.dataadapter.DataAdapters.oneToOne;
import static tech.intellispaces.action.dataadapter.DataAdapters.predefined;

/**
 * Provider of the {@link GetOrSetIfAbsentAction} action.
 */
public class GetOrSetIfAbsentActions {

  @SuppressWarnings("unchecked")
  public static <R, D> GetOrSetIfAbsentAction<R, D> get(Class<D> dataClass) {
    return (GetOrSetIfAbsentAction<R, D>) INSTANCE;
  }

  public static <R, D> Action1<R, D> get(
      Class<D> dataClass,
      Function<D, R> getter,
      BiConsumer<D, R> setter,
      Supplier<R> supplier
  ) {
    GetOrSetIfAbsentAction<R, D> action = get(dataClass);
    return action.convertToAction1(
        oneToOne(),
        predefined(getter),
        predefined(setter),
        predefined(supplier)
    );
  }

  private static final GetOrSetIfAbsentAction<?, ?> INSTANCE = new GetOrSetIfAbsentAction<>();

  private GetOrSetIfAbsentActions() {}
}
