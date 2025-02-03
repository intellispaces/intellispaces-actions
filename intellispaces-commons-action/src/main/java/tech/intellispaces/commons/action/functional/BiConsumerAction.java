package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.processor.AbstractProcessorAction2;

import java.util.function.BiConsumer;

class BiConsumerAction<D1, D2> extends AbstractProcessorAction2<D1, D2> {
  private final BiConsumer<D1, D2> consumer;

  BiConsumerAction(BiConsumer<D1, D2> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D1 data1, D2 data2) {
    consumer.accept(data1, data2);
  }
}
