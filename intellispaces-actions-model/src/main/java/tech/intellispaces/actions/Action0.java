package tech.intellispaces.actions;

public interface Action0<R> extends
  Action,
  Action1<R, Void>,
  Action5<R, Void, Void, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute();

  @Override
  default R execute(Void data1, Void data2, Void data3, Void data4, Void data5) {
    return execute();
  }
}
