package tech.intellispaces.action.conditional;

import tech.intellispaces.action.AbstractAction4;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class GetAndSetIfAbsentAction<R, D>
    extends AbstractAction4<R, D, Function<D, R>, BiConsumer<D, R>, Supplier<R>>
{
  @Override
  public R execute(D data, Function<D, R> getter, BiConsumer<D, R> setter, Supplier<R> supplier) {
    R result = getter.apply(data);
    if (result == null) {
      result = supplier.get();
      if (result != null) {
        setter.accept(data, result);
      }
    }
    return result;
  }
}
