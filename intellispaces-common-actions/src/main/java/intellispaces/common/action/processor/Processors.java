package intellispaces.common.action.processor;

import java.util.function.Consumer;

public interface Processors {

  static <D> Processor1<D> of(Consumer<D> consumer) {
    return new Processor1BasedOnConsumer<>(consumer);
  }
}
