package tech.intellispaces.action.mapper;

import tech.intellispaces.action.Action3;
import tech.intellispaces.entity.function.TriFunction;

/**
 * The mapper action form 3.</p>
 *
 * This is the action form that take three inputs and maps it to returned result data. Inputs are not changed.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 */
public interface MapperAction3<R, D1, D2, D3> extends Action3<R, D1, D2, D3>, TriFunction<D1, D2, D3, R> {

  /**
   * Maps input data to result.
   *
   * @param data1 the first input.
   * @param data2 the second input.
   * @param data3 the third input.
   * @return the result data.
   */
  R map(D1 data1, D2 data2, D3 data3);

  int mapToInt(D1 data1, D2 data2, D3 data3);

  double mapToDouble(D1 data1, D2 data2, D3 data3);
}
