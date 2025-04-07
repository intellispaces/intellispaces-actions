package tech.intellispaces.actions.functional;

import tech.intellispaces.actions.processor.AbstractProcessorAction3;
import tech.intellispaces.commons.function.Consumer3;

class TriConsumerAction<D1, D2, D3> extends AbstractProcessorAction3<D1, D2, D3> {
  private final Consumer3<D1, D2, D3> consumer;

  TriConsumerAction(Consumer3<D1, D2, D3> consumer) {
    this.consumer = consumer;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3) {
    consumer.accept(data1, data2, data3);
  }
}
