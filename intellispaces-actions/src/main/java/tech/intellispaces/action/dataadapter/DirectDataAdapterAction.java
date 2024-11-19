package tech.intellispaces.action.dataadapter;

import tech.intellispaces.action.AbstractAction2;

import java.util.Objects;

public class DirectDataAdapterAction<T>
    extends AbstractAction2<T, Object[], Integer>
    implements DataAdapterAction<T>
{
  @Override
  public T execute(Object[] allData, Integer dataIndex) {
    Objects.requireNonNull(allData);
    return execute(allData, (int) dataIndex);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T execute(Object[] allData, int dataIndex) {
    if (dataIndex < 0 || dataIndex >= allData.length) {
      throw new IndexOutOfBoundsException();
    }
    return (T) allData[dataIndex];
  }
}
