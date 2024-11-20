package tech.intellispaces.action.mapper;

import tech.intellispaces.action.Action1;

import java.util.function.Function;

/**
 * The mapper action form.</p>
 *
 * This is the action form that take single input data and maps it to returned result data. Input data is not changed.
 *
 * @param <R> action return type.
 * @param <D> input data type.
 */
public interface MapperAction<R, D> extends Action1<R, D>, Function<D, R> {

  /**
   * Maps input data to result.
   *
   * @param data the input data.
   * @return the result data.
   */
  R map(D data);
}
