package tech.intellispaces.action.dataadapter;

import tech.intellispaces.action.AbstractAction2;

public class PredefinedDataAdapterAction<T>
    extends AbstractAction2<T, Object[], Integer>
    implements DataAdapterAction<T>
{
  private final T target;

  public PredefinedDataAdapterAction(T target) {
    this.target = target;
  }

  @Override
  public T execute(Object[] inputData, Integer dataIndex) {
    return target;
  }

  @Override
  public T execute(Object[] inputData, int dataIndex) {
    return target;
  }

  @Override
  public int executeReturnInt(Object[] inputData, Integer dataIndex) {
    return (int) target;
  }

  @Override
  public double executeReturnDouble(Object[] inputData, Integer dataIndex) {
    return (double) target;
  }
}
