package tech.intellispaces.action.dataextractor;

import tech.intellispaces.action.Action2;

/**
 * Data extractor action.
 *
 * @param <T> target data type.
 */
public interface DataExtractorAction<T> extends Action2<T, Object[], Integer> {

  @Override
  T execute(Object[] data, Integer dataIndex);
}
