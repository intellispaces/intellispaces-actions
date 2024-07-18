package tech.intellispaces.framework.commons.action.processor;

import java.util.function.Consumer;

public class ConsumerBasedProcessor1<D> extends AbstractProcessor1<D> {
  private final Consumer<D> consumer;

  public ConsumerBasedProcessor1(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D data) {
    consumer.accept(data);
  }
}
