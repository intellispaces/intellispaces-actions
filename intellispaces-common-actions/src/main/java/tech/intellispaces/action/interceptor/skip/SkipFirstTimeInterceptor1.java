package tech.intellispaces.action.interceptor.skip;

import tech.intellispaces.action.AbstractAction1;
import tech.intellispaces.action.Action;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.wrapper.WrapperAction1;

public class SkipFirstTimeInterceptor1<R, D> extends AbstractAction1<R, D> implements WrapperAction1<R, D> {
  private final Action1<R, D> interceptedAction;
  private final SkipFirstTimeInterceptorExecutor<R> executor;

  public SkipFirstTimeInterceptor1(Action1<R, D> interceptedAction) {
    this(interceptedAction, null);
  }

  public SkipFirstTimeInterceptor1(Action1<R, D> interceptedAction, R defaultResult) {
    this.interceptedAction = interceptedAction;
    this.executor = new SkipFirstTimeInterceptorExecutor<>(defaultResult);
  }

  @Override
  public Action wrappedAction() {
    return interceptedAction;
  }

  @Override
  public R execute(D data) {
    return executor.execute(() -> interceptedAction.execute(data));
  }

  @Override
  public R execute(int data) {
    return executor.execute(() -> interceptedAction.execute(data));
  }

  @Override
  public R execute(double data) {
    return executor.execute(() -> interceptedAction.execute(data));
  }

  @Override
  public int executeReturnInt(D data) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data));
  }

  @Override
  public int executeReturnInt(int data) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data));
  }

  @Override
  public int executeReturnInt(double data) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(data));
  }

  @Override
  public double executeReturnDouble(D data) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data));
  }

  @Override
  public double executeReturnDouble(int data) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data));
  }

  @Override
  public double executeReturnDouble(double data) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(data));
  }
}
