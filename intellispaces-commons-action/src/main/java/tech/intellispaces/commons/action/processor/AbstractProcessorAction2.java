package tech.intellispaces.commons.action.processor;

import tech.intellispaces.commons.action.AbstractAction2;
import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.Actions;
import tech.intellispaces.commons.action.chain.processor.ChainProcessorActions;
import tech.intellispaces.commons.action.runnable.RunnableAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction2;

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
