package tech.intellispaces.commons.action.processor;

import tech.intellispaces.commons.action.AbstractAction5;
import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.Actions;
import tech.intellispaces.commons.action.chain.processor.ChainProcessorActions;
import tech.intellispaces.commons.action.runnable.RunnableAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction5;

import java.util.function.Function;

public abstract class AbstractProcessorAction5<D1, D2, D3, D4, D5>
    extends AbstractAction5<Void, D1, D2, D3, D4, D5>
    implements ProcessorAction5<D1, D2, D3, D4, D5>
{
  @Override
  public Void execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    process(data1, data2, data3, data4, data5);
    return null;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    process(data1, data2, data3, data4, (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    process(data1, data2, data3, data4, (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5) {
    process(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    process(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4, int data5) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4, double data5) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4, int data5) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4, double data5) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4, int data5) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4, double data5) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4, int data5) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4, double data5) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4, int data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4, double data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4, int data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4, double data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4, int data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4, double data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4, int data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4, double data5) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4, int data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4, double data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4, int data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4, double data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4, int data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4, double data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4, int data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4, double data5) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  public ProcessorAction5<D1, D2, D3, D4, D5> andThen(Action5<Void, D1, D2, D3, D4, D5> nextAction) {
    return ProcessorActions.processorAction5(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return Actions.runnableAction(this::process, data1, data2, data3, data4, data5);
  }

  @Override
  public <W extends WrapperAction5<Void, _D1, _D2, _D3, _D4, _D5>, _D1, _D2, _D3, _D4, _D5> ProcessorAction5<_D1, _D2, _D3, _D4, _D5> wrapProcessorAction5(
      Function<Action5<Void, D1, D2, D3, D4, D5>, W> wrapperFactory
  ) {
    return ProcessorActions.processorAction5(wrapperFactory.apply(this));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4, double data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4, int data5) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4, double data5) {
    throw new UnsupportedOperationException();
  }
}
