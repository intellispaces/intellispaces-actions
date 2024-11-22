package tech.intellispaces.action.mapper;

import tech.intellispaces.action.Action1;

import java.util.function.Function;

/**
 * The mapper action form 1.</p>
 *
 * This is the action form that take single input and maps it to returned result data. Input is not changed.
 *
 * @param <R> action return type.
 * @param <D> input type.
 */
public interface MapperAction1<R, D> extends Action1<R, D>, Function<D, R> {

  /**
   * Maps input data to result.
   *
   * @param data the input data.
   * @return the result data.
   */
  R map(D data);

  int mapToInt(D data);

  double mapToDouble(D data);
}
