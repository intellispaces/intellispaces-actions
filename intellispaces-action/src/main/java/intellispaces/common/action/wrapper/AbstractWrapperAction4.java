package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction4;
import intellispaces.common.action.Action4;

public abstract class AbstractWrapperAction4<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements WrapperAction4<R, D1, D2, D3, D4>
{
  private final Action4<R, D1, D2, D3, D4> wrappedAction;

  public AbstractWrapperAction4(Action4<R, D1, D2, D3, D4> wrappedAction) {
    this.wrappedAction = wrappedAction;
  }

  @Override
  public Action4<R, D1, D2, D3, D4> wrappedAction() {
    return wrappedAction;
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4);
  }
}
