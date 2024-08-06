package tech.intellispaces.actions;

public interface Action4<R, D1, D2, D3, D4> extends
  Action5<R, D1, D2, D3, D4, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4);

  @Override
  default R execute(D1 data1, D2 data2, D3 data3, D4 data4, Void data5) {
    return execute(data1, data2, data3, data4);
  }
}
