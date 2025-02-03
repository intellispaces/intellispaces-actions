package tech.intellispaces.commons.action.processor;

import tech.intellispaces.commons.action.Action6;
import tech.intellispaces.commons.action.wrapper.WrapperAction6;

class ProcessorAction6BasedOnAction6<D1, D2, D3, D4, D5, D6>
    extends AbstractProcessorAction6<D1, D2, D3, D4, D5, D6>
    implements WrapperAction6<Void, D1, D2, D3, D4, D5, D6>
{
  private final Action6<Void, D1, D2, D3, D4, D5, D6> action6;

  ProcessorAction6BasedOnAction6(Action6<Void, D1, D2, D3, D4, D5, D6> action6) {
    this.action6 = action6;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, int data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, int data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, int data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, int data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, double data5, int data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public void process(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    action6.execute(data1, data2, data3, data4, data5, data6);
  }

  @Override
  public Action6<Void, D1, D2, D3, D4, D5, D6> wrappedAction() {
    return action6;
  }
}
