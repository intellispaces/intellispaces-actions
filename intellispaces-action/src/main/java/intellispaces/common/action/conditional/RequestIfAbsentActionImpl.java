package intellispaces.common.action.conditional;

import intellispaces.common.action.AbstractAction4;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

class RequestIfAbsentActionImpl<R, D>
    extends AbstractAction4<R, D, Function<D, R>, BiConsumer<D, R>, Supplier<R>>
    implements RequestIfAbsentAction<R, D>
{
  @Override
  public R execute(D data, Function<D, R> getter, BiConsumer<D, R> setter, Supplier<R> supplier) {
    R result = getter.apply(data);
    if (result == null) {
      result = supplier.get();
      setter.accept(data, result);
    }
    return result;
  }
}
