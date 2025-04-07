package tech.intellispaces.actions.dataadapter;

import tech.intellispaces.actions.Action2;

/**
 * Action data adapter.<p/>
 *
 * This action converts input data from one action to input data another action.
 *
 * @param <T> target data type.
 */
public interface DataAdapterAction<T> extends Action2<T, Object[], Integer> {

  /**
   * Converts input data from origin action to input data target action.
   *
   * @param inputs array of input data of the origin action.
   * @param index data index of the input data of the target action.
   * @return the input data of the target action.
   */
  @Override
  T execute(Object[] inputs, Integer index);
}
