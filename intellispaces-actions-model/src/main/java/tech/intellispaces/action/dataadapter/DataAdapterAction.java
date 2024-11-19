package tech.intellispaces.action.dataadapter;

import tech.intellispaces.action.Action2;

/**
 * Action data adapter action.
 *
 * @param <T> target data type.
 */
public interface DataAdapterAction<T> extends Action2<T, Object[], Integer> {

  @Override
  T execute(Object[] allData, Integer dataIndex);
}
