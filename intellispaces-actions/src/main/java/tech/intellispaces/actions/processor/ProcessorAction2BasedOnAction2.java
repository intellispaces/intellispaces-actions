package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.wrapper.WrapperAction2;

class ProcessorAction2BasedOnAction2<D1, D2>
    extends AbstractProcessorAction2<D1, D2>
    implements WrapperAction2<Void, D1, D2>
{
  private final Action2<Void, D1, D2> action2;

  ProcessorAction2BasedOnAction2(Action2<Void, D1, D2> action2) {
    this.action2 = action2;
  }

  @Override
  public void process(D1 data1, D2 data2) {
    action2.execute(data1, data2);
  }

  @Override
  public void process(D1 data1, int data2) {
    action2.execute(data1, data2);
  }

  @Override
  public void process(D1 data1, double data2) {
    action2.execute(data1, data2);
  }

  @Override
  public Action2<Void, D1, D2> wrappedAction() {
    return action2;
  }
}
