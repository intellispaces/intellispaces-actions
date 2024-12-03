package tech.intellispaces.action.mapper;

import tech.intellispaces.action.Action4;
import tech.intellispaces.general.function.QuadriFunction;

/**
 * The mapper action form 4.</p>
 *
 * This is the action form that take four inputs and maps it to returned result data. Inputs are not changed.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 * @param <D3> the third input type.
 * @param <D4> the fourth input type.
 */
public interface MapperAction4<R, D1, D2, D3, D4>
    extends Action4<R, D1, D2, D3, D4>, QuadriFunction<D1, D2, D3, D4, R>
{
  /**
   * Maps input data to result.
   *
   * @param data1 the first input.
   * @param data2 the second input.
   * @param data3 the third input.
   * @param data4 the fourth input.
   * @return the result data.
   */
  R map(D1 data1, D2 data2, D3 data3, D4 data4);

  int mapToInt(D1 data1, D2 data2, D3 data3, D4 data4);

  double mapToDouble(D1 data1, D2 data2, D3 data3, D4 data4);
}
