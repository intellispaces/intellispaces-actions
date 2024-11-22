package tech.intellispaces.action.mapper;

import tech.intellispaces.action.Action2;

import java.util.function.BiFunction;

/**
 * The mapper action form 2.</p>
 *
 * This is the action form that take the pair of inputs and maps it to returned result data. Inputs are not changed.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 */
public interface MapperAction2<R, D1, D2> extends Action2<R, D1, D2>, BiFunction<D1, D2, R> {

  /**
   * Maps input data to result.
   *
   * @param data1 the first input
   * @param data2 the second input.
   * @return the result data.
   */
  R map(D1 data1, D2 data2);

  int mapToInt(D1 data1, D2 data2);

  double mapToDouble(D1 data1, D2 data2);
}
