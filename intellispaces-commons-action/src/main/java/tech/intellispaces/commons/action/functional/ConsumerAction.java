package tech.intellispaces.commons.action.functional;

import tech.intellispaces.commons.action.AbstractAction1;

import java.util.function.Consumer;

class ConsumerAction<D> extends AbstractAction1<Void, D> {
  private final Consumer<D> consumer;

  ConsumerAction(Consumer<D> consumer) {
    this.consumer = consumer;
  }

  @Override
  public Void execute(D data) {
    consumer.accept(data);
    return null;
  }

  @Override
  public int executeReturnInt(D data) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data) {
    throw new UnsupportedOperationException();
  }
}
