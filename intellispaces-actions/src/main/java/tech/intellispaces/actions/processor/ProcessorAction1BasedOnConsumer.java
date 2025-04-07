package tech.intellispaces.actions.processor;

import java.util.function.Consumer;

class ProcessorAction1BasedOnConsumer<D> extends AbstractProcessorAction1<D> {
  private final Consumer<D> consumer;

  ProcessorAction1BasedOnConsumer(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D data) {
    consumer.accept(data);
  }
}
