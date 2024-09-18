package intellispaces.common.action.functional;

import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.Action2;

import java.util.function.BiConsumer;

class BiConsumerAction<D1, D2> extends AbstractAction2<Void, D1, D2> implements Action2<Void, D1, D2> {
  private final BiConsumer<D1, D2> consumer;

  BiConsumerAction(BiConsumer<D1, D2> consumer) {
    this.consumer = consumer;
  }

  @Override
  public Void execute(D1 data1, D2 data2) {
    consumer.accept(data1, data2);
    return null;
  }
}
