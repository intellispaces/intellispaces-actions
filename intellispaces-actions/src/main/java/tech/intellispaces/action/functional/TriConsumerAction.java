package tech.intellispaces.action.functional;

import tech.intellispaces.action.processor.AbstractProcessorAction3;
import tech.intellispaces.general.function.TriConsumer;

class TriConsumerAction<D1, D2, D3> extends AbstractProcessorAction3<D1, D2, D3> {
  private final TriConsumer<D1, D2, D3> consumer;

  TriConsumerAction(TriConsumer<D1, D2, D3> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3) {
    consumer.accept(data1, data2, data3);
  }
}
