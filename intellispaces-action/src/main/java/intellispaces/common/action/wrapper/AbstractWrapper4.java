package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction4;
import intellispaces.common.action.Action4;

public abstract class AbstractWrapper4<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements Wrapper4<R, D1, D2, D3, D4>
{
  private final Action4<R, D1, D2, D3, D4> wrappedAction;

  public AbstractWrapper4(Action4<R, D1, D2, D3, D4> action) {
    this.wrappedAction = action;
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
