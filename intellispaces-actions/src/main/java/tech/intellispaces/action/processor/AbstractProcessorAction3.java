package tech.intellispaces.action.processor;

import tech.intellispaces.action.AbstractAction3;
import tech.intellispaces.action.Action3;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.chain.processor.ChainProcessorActions;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction3;

import java.util.function.Function;

public abstract class AbstractProcessorAction3<D1, D2, D3>
    extends AbstractAction3<Void, D1, D2, D3>
    implements ProcessorAction3<D1, D2, D3>
{
  @Override
  public Void execute(D1 data1, D2 data2, D3 data3) {
    process(data1, data2, data3);
    return null;
  }

  @Override
  public void accept(D1 arg1, D2 arg2, D3 arg3) {
    process(arg1, arg2, arg3);
  }

  public ProcessorAction3<D1, D2, D3> andThen(Action3<Void, D1, D2, D3> nextAction) {
    return ProcessorActions.processorAction3(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(D1 data1, D2 data2, D3 data3) {
    return Actions.runnableAction(this::process, data1, data2, data3);
  }

  @Override
  public <W extends WrapperAction3<Void, _D1, _D2, _D3>, _D1, _D2, _D3> ProcessorAction3<_D1, _D2, _D3> wrapProcessorAction3(
      Function<Action3<Void, D1, D2, D3>, W> wrapperFactory
  ) {
    return ProcessorActions.processorAction3(wrapperFactory.apply(this));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3) {
    process(data1, data2, (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3) {
    process(data1, data2, (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3) {
    throw new UnsupportedOperationException();
  }
}
