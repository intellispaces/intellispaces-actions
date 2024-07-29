package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Processor1;

import java.util.function.Consumer;

public interface Processors {

  static <D> Processor1<D> of(Consumer<D> consumer) {
    return new ConsumerBasedProcessor1<>(consumer);
  }
}
