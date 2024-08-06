package tech.intellispaces.actions;

public interface Action3<R, D1, D2, D3> extends
  Action4<R, D1, D2, D3, Void>,
  Action5<R, D1, D2, D3, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3);

  @Override
  default R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return execute(data1, data2, data3);
  }
}
