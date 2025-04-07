package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.wrapper.WrapperAction3;

class ProcessorAction3BasedOnAction3<D1, D2, D3>
    extends AbstractProcessorAction3<D1, D2, D3>
    implements WrapperAction3<Void, D1, D2, D3>
{
  private final Action3<Void, D1, D2, D3> action3;

  ProcessorAction3BasedOnAction3(Action3<Void, D1, D2, D3> action3) {
    this.action3 = action3;
  }

  @Override
  public void process(D1 data1, D2 data2, D3 data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public void process(D1 data1, D2 data2, int data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public void process(D1 data1, D2 data2, double data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public void process(D1 data1, int data2, int data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public void process(D1 data1, int data2, double data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public void process(D1 data1, double data2, int data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public void process(D1 data1, double data2, double data3) {
    action3.execute(data1, data2, data3);
  }

  @Override
  public Action3<Void, D1, D2, D3> wrappedAction() {
    return action3;
  }
}
