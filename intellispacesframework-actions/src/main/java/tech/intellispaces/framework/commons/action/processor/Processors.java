package tech.intellispaces.framework.commons.action.processor;

import tech.intellispaces.framework.commons.action.Processor1;

import java.util.function.Consumer;

public interface Processors {

  static <D> Processor1<D> of(Consumer<D> consumer) {
    return new ConsumerBasedProcessor1<>(consumer);
  }
}
