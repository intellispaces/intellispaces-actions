package tech.intellispaces.action.mapper;

import tech.intellispaces.action.Action5;
import tech.intellispaces.entity.function.QuintiFunction;

/**
 * The mapper action form 5.</p>
 *
 * This is the action form that take five inputs and maps it to returned result data. Inputs are not changed.
 *
 * @param <R> the action return type.
 * @param <D1> the first input type.
 * @param <D2> the second input type.
 * @param <D3> the third input type.
 * @param <D4> the fourth input type.
 * @param <D5> the fifth input type.
 */
public interface MapperAction5<R, D1, D2, D3, D4, D5>
    extends Action5<R, D1, D2, D3, D4, D5>, QuintiFunction<D1, D2, D3, D4, D5, R>
{
  /**
   * Maps input data to result.
   *
   * @param data1 the first input.
   * @param data2 the second input.
   * @param data3 the third input.
   * @param data4 the fourth input.
   * @param data5 the fifth input.
   * @return the result data.
   */
  R map(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  int mapToInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  double mapToDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);
}
