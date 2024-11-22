package tech.intellispaces.action.processor;

import tech.intellispaces.action.AbstractAction6;
import tech.intellispaces.action.Action6;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.chain.processor.ChainProcessorActions;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction6;

import java.util.function.Function;

public abstract class AbstractProcessorAction6<D1, D2, D3, D4, D5, D6>
    extends AbstractAction6<Void, D1, D2, D3, D4, D5, D6>
    implements ProcessorAction6<D1, D2, D3, D4, D5, D6>
{
  @Override
  public Void execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    process(data1, data2, data3, data4, data5, data6);
    return null;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6) {
    process(data1, data2, data3, data4, data5, (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6) {
    process(data1, data2, data3, data4, data5, (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6) {
    process(data1, data2, data3, data4, (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6) {
    process(data1, data2, data3, data4, (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5, int data6) {
    process(data1, data2, data3, data4, (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6) {
    process(data1, data2, data3, data4, (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5, int data6) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    process(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5, int data6) {
    process(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4, int data5, double data6) {
    process(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5, int data6) {
    process(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    process(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4, double data5, int data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4, int data5, int data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4, int data5, double data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4, double data5, int data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    process(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4, int data5, int data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4, int data5, double data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4, double data5, int data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, int data4, double data5, double data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4, int data5, int data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4, int data5, double data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4, double data5, int data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    process(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4, double data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4, int data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4, int data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4, double data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4, int data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4, int data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4, double data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, int data4, double data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4, int data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4, int data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4, double data5, int data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    process(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4, int data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4, int data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4, double data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, int data4, double data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4, int data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4, int data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4, double data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, int data3, double data4, double data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4, int data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4, int data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4, double data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, int data4, double data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4, int data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4, int data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4, double data5, int data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Integer.valueOf(data6));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void process(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    process(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5), (D6) Double.valueOf(data6));
  }

  @Override
  public ProcessorAction6<D1, D2, D3, D4, D5, D6> andThen(Action6<Void, D1, D2, D3, D4, D5, D6> nextAction) {
    return ProcessorActions.processorAction6(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    return Actions.runnableAction(this::process, data1, data2, data3, data4, data5, data6);
  }

  @Override
  public <W extends WrapperAction6<Void, _D1, _D2, _D3, _D4, _D5, _D6>, _D1, _D2, _D3, _D4, _D5, _D6> ProcessorAction6<_D1, _D2, _D3, _D4, _D5, _D6> wrapProcessorAction6(
      Function<Action6<Void, D1, D2, D3, D4, D5, D6>, W> wrapperFactory
  ) {
    return ProcessorActions.processorAction6(wrapperFactory.apply(this));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw new UnsupportedOperationException();
  }
}
