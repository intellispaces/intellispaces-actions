package tech.intellispaces.action.dataadapter;

import tech.intellispaces.action.AbstractAction2;

import java.util.Objects;

public class DirectDataAdapterAction<T>
    extends AbstractAction2<T, Object[], Integer>
    implements DataAdapterAction<T>
{
  @Override
  public T execute(Object[] inputData, Integer dataIndex) {
    Objects.requireNonNull(inputData);
    return execute(inputData, (int) dataIndex);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T execute(Object[] inputData, int dataIndex) {
    if (dataIndex < 0 || dataIndex >= inputData.length) {
      throw new IndexOutOfBoundsException();
    }
    return (T) inputData[dataIndex];
  }
}
