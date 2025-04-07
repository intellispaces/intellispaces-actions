package tech.intellispaces.actions.processor;

import tech.intellispaces.actions.AbstractAction4;
import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.chain.processor.ChainProcessorActions;
import tech.intellispaces.actions.runnable.RunnableAction;
import tech.intellispaces.actions.wrapper.WrapperAction4;

import java.util.function.Function;

public abstract class AbstractProcessorAction4<D1, D2, D3, D4>
    extends AbstractAction4<Void, D1, D2, D3, D4>
    implements ProcessorAction4<D1, D2, D3, D4>
{
  @Override
  public Void execute(D1 data1, D2 data2, D3 data3, D4 data4) {
    process(data1, data2, data3, data4);
    return null;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4) {
    process(data1, data2, data3, (D4) Double.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4));
  }

  public ProcessorAction4<D1, D2, D3, D4> andThen(Action4<Void, D1, D2, D3, D4> nextAction) {
    return ProcessorActions.processorAction4(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(D1 data1, D2 data2, D3 data3, D4 data4) {
    return Actions.runnableAction(this::process, data1, data2, data3, data4);
  }

  @Override
  public <W extends WrapperAction4<Void, _D1, _D2, _D3, _D4>, _D1, _D2, _D3, _D4> ProcessorAction4<_D1, _D2, _D3, _D4> wrapProcessorAction4(
      Function<Action4<Void, D1, D2, D3, D4>, W> wrapperFactory
  ) {
    return ProcessorActions.processorAction4(wrapperFactory.apply(this));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4) {
    throw new UnsupportedOperationException();
  }
}
