package tech.intellispaces.commons.action.dataadapter;

import tech.intellispaces.commons.action.AbstractAction2;

class PredefinedDataAdapterAction<T>
    extends AbstractAction2<T, Object[], Integer>
    implements DataAdapterAction<T>
{
  private final T target;

  PredefinedDataAdapterAction(T target) {
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
