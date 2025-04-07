package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.AbstractAction2;
import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.chain.processor.ChainProcessorActions;
import tech.intellispaces.actions.runnable.RunnableAction;
import tech.intellispaces.actions.wrapper.WrapperAction2;

import java.util.function.Function;

public abstract class AbstractProcessorAction2<D1, D2>
    extends AbstractAction2<Void, D1, D2>
    implements ProcessorAction2<D1, D2>
{
  @Override
  public Void execute(D1 data1, D2 data2) {
    process(data1, data2);
    return null;
  }

  @Override
  public void accept(D1 data1, D2 data2) {
    process(data1, data2);
  }

  @Override
  public ProcessorAction2<D1, D2> andThen(Action2<Void, D1, D2> nextAction) {
    return ProcessorActions.processorAction2(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(D1 data1, D2 data2) {
    return Actions.runnableAction(this::process, data1, data2);
  }

  @Override
  public <W extends WrapperAction2<Void, _D1, _D2>, _D1, _D2> ProcessorAction2<_D1, _D2> wrapProcessorAction2(
      Function<Action2<Void, D1, D2>, W> wrapperFactory
  ) {
    return ProcessorActions.processorAction2(wrapperFactory.apply(this));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2) {
    process(data1, (D2) Integer.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2) {
    process(data1, (D2) Double.valueOf(data2));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2) {
    throw new UnsupportedOperationException();
  }
}
