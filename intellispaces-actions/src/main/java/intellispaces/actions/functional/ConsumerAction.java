package intellispaces.actions.functional;

import intellispaces.actions.AbstractAction1;
import intellispaces.actions.Action1;

import java.util.function.Consumer;

class ConsumerAction<D> extends AbstractAction1<Void, D> implements Action1<Void, D> {
  private final Consumer<D> consumer;

  ConsumerAction(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public Void execute(D data) {
    consumer.accept(data);
    return null;
  }
}
