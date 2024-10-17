package intellispaces.common.action.delegate;

import intellispaces.common.action.AbstractAction4;
import intellispaces.common.action.Action4;
import intellispaces.common.action.getter.Getter;

class Delegate4Impl<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements Delegate4<R, D1, D2, D3, D4>
{
  private final Getter<Action4<R, D1, D2, D3, D4>> contractor;

  Delegate4Impl(Getter<Action4<R, D1, D2, D3, D4>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    return contractor.get().execute(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    return contractor.get().executeReturnInt(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    return contractor.get().executeReturnDouble(data1, data2, data3, data4);
  }

  @Override
  public Getter<Action4<R, D1, D2, D3, D4>> contractor() {
    return contractor;
  }
}
