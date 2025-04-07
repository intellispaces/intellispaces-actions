package tech.intellispaces.actions.interceptor.skip;

import tech.intellispaces.actions.AbstractAction5;
import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.WrapperAction5;

public class SkipFollowingTimesInterceptor5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements WrapperAction5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> interceptedAction;
  private final SkipFollowingTimesInterceptorExecutor<R> executor;

  public SkipFollowingTimesInterceptor5(Action5<R, D1, D2, D3, D4, D5> interceptedAction) {
    this(interceptedAction, null);
  }

  public SkipFollowingTimesInterceptor5(Action5<R, D1, D2, D3, D4, D5> interceptedAction, R defaultResult) {
    this.interceptedAction = interceptedAction;
    this.executor = new SkipFollowingTimesInterceptorExecutor<>(defaultResult);
  }

  @Override
  public Action wrappedAction() {
    return interceptedAction;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, D2 data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, int data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(D1 data1, double data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, int data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(int data1, double data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, int data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, int data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, int data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, int data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, int data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, double data3, int data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, double data3, int data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, double data3, double data4, int data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public R execute(double data1, double data2, double data3, double data4, double data5) {
    return executor.execute(() -> interceptedAction.execute(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4, int data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4, double data5) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4, int data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4, double data5) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data1, data2, data3, data4, data5));
  }
}
