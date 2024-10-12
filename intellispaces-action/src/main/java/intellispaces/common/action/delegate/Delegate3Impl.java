package intellispaces.common.action.delegate;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.action.getter.Getter;

class Delegate3Impl<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements Delegate3<R, D1, D2, D3>
{
  private final Getter<Action3<R, D1, D2, D3>> contractor;

  Delegate3Impl(Getter<Action3<R, D1, D2, D3>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3) {
    return contractor.get().execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, int data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3) {
    return contractor.get().executeReturnInt(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, int data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3) {
    return contractor.get().executeReturnDouble(data1, data2, data3);
  }

  @Override
  public Getter<Action3<R, D1, D2, D3>> contractor() {
    return contractor;
  }
}
