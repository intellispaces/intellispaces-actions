package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.wrapper.WrapperAction4;

class ProcessorAction4BasedOnAction4<D1, D2, D3, D4>
    extends AbstractProcessorAction4<D1, D2, D3, D4>
    implements WrapperAction4<Void, D1, D2, D3, D4>
{
  private final Action4<Void, D1, D2, D3, D4> action4;

  ProcessorAction4BasedOnAction4(Action4<Void, D1, D2, D3, D4> action4) {
    this.action4 = action4;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4) {
    action4.execute(data1, data2, data3, data4);
  }

  @Override
  public Action4<Void, D1, D2, D3, D4> wrappedAction() {
    return action4;
  }
}
