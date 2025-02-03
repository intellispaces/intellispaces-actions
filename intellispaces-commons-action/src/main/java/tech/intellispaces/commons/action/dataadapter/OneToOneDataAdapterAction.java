package tech.intellispaces.commons.action.dataadapter;

import tech.intellispaces.commons.action.AbstractAction2;

import java.util.Objects;

class OneToOneDataAdapterAction<T>
    extends AbstractAction2<T, Object[], Integer>
    implements DataAdapterAction<T>
{
  @Override
  public T execute(Object[] inputs, Integer index) {
    Objects.requireNonNull(inputs);
    return execute(inputs, (int) index);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T execute(Object[] inputs, int index) {
    if (index < 0 || index >= inputs.length) {
      throw new IndexOutOfBoundsException();
    }
    return (T) inputs[index];
  }
}
