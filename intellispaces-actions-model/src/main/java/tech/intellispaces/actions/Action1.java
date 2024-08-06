package tech.intellispaces.actions;

public interface Action1<R, D> extends
  Action2<R, D, Void>,
  Action3<R, D, Void, Void>,
  Action4<R, D, Void, Void, Void>,
  Action5<R, D, Void, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute(D data);

  @Override
  default R execute(D data1, Void data2, Void data3, Void data4, Void data5) {
    return execute(data1);
  }
}
