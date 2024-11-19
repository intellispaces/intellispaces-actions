package tech.intellispaces.action.processor;

import tech.intellispaces.action.Action5;
import tech.intellispaces.action.wrapper.WrapperAction5;

class ProcessorAction5BasedOnAction5<D1, D2, D3, D4, D5>
    extends AbstractProcessorAction5<D1, D2, D3, D4, D5>
    implements WrapperAction5<Void, D1, D2, D3, D4, D5>
{
  private final Action5<Void, D1, D2, D3, D4, D5> action5;

  ProcessorAction5BasedOnAction5(Action5<Void, D1, D2, D3, D4, D5> action5) {
    this.action5 = action5;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, int data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, double data5) {
    action5.execute(data1, data2, data3, data4, data5);
  }

  @Override
  public Action5<Void, D1, D2, D3, D4, D5> wrappedAction() {
    return action5;
  }
}
