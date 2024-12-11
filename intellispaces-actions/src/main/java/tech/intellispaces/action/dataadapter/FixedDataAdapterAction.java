package tech.intellispaces.action.dataadapter;

import tech.intellispaces.action.AbstractAction2;

import java.util.Objects;

class FixedDataAdapterAction<T>
    extends AbstractAction2<T, Object[], Integer>
    implements DataAdapterAction<T>
{
  private final int index;

  FixedDataAdapterAction(int index) {
    this.index = index;
  }

  @Override
  public T execute(Object[] inputs, Integer index) {
    Objects.requireNonNull(inputs);
    return execute(inputs, (int) index);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T execute(Object[] inputs, int index) {
    if (this.index < 0 || this.index >= inputs.length) {
      throw new IndexOutOfBoundsException();
    }
    return (T) inputs[this.index];
  }
}
