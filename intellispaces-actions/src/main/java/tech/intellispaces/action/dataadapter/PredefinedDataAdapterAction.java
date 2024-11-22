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
  public T execute(Object[] inputs, Integer index) {
    return target;
  }

  @Override
  public T execute(Object[] inputs, int index) {
    return target;
  }

  @Override
  public int executeReturnInt(Object[] inputs, Integer index) {
    return (int) target;
  }

  @Override
  public double executeReturnDouble(Object[] inputs, Integer index) {
    return (double) target;
  }
}
