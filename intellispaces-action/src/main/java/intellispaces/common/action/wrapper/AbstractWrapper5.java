package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction5;
import intellispaces.common.action.Action5;

public abstract class AbstractWrapper5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Wrapper5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> wrappedAction;

  public AbstractWrapper5(Action5<R, D1, D2, D3, D4, D5> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> wrappedAction() {
    return wrappedAction;
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, D4 data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, long data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, double data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, double data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, double data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, long data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, long data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, long data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, long data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, double data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, double data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, double data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, long data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, long data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, long data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, long data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, long data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, double data3, long data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, double data3, long data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, double data3, double data4, long data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public long executeReturnLong(D1 data1, double data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnLong(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, long data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, long data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, long data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, long data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, long data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, double data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, double data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, double data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, long data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, long data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, long data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, long data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, long data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, long data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, long data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, long data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    return wrappedAction.executeReturnDouble(data1, data2, data3, data4, data5);
  }
}
