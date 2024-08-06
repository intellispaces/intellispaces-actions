package tech.intellispaces.actions;

public interface Action2<R, D1, D2> extends
  Action3<R, D1, D2, Void>,
  Action4<R, D1, D2, Void, Void>,
  Action5<R, D1, D2, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2);

  @Override
  default R execute(D1 data1, D2 data2, Void data3, Void data4, Void data5) {
    return execute(data1, data2);
  }
}
