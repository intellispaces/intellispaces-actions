package tech.intellispaces.actions.processor;

import java.util.function.Consumer;

class ConsumerBasedProcessor1<D> extends AbstractProcessor1<D> {
  private final Consumer<D> consumer;

  ConsumerBasedProcessor1(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D data) {
    consumer.accept(data);
  }
}
