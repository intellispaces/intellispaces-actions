package intellispaces.common.action.conditional;

import intellispaces.common.action.Action4;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface RequestIfAbsentAction<R, D> extends Action4<R, D, Function<D, R>, BiConsumer<D, R>, Supplier<R>> {

  @Override
  R execute(D data, Function<D, R> getter, BiConsumer<D, R> setter, Supplier<R> supplier);
}
