package intellispaces.actions.processor;

import java.util.function.Consumer;

class Processor1BasedOnConsumer<D> extends AbstractProcessor1<D> {
  private final Consumer<D> consumer;

  Processor1BasedOnConsumer(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D data) {
    consumer.accept(data);
  }
}
