package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction5;
import intellispaces.common.action.Action5;

public abstract class AbstractWrapperAction5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements WrapperAction5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> wrappedAction;

  public AbstractWrapperAction5(Action5<R, D1, D2, D3, D4, D5> wrappedAction) {
    this.wrappedAction = wrappedAction;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> wrappedAction() {
    return wrappedAction;
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnInt(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }
}
