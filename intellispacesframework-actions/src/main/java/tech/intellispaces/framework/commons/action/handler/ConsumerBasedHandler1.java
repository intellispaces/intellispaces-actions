package tech.intellispaces.framework.commons.action.handler;

import java.util.function.Consumer;

public class ConsumerBasedHandler1<D> extends AbstractHandler1<D> {
  private final Consumer<D> consumer;

  public ConsumerBasedHandler1(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void handle(D data) {
    consumer.accept(data);
  }
}
