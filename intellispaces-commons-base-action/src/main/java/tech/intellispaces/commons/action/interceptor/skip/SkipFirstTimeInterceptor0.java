package tech.intellispaces.commons.action.interceptor.skip;

import tech.intellispaces.commons.action.AbstractAction0;
import tech.intellispaces.commons.action.Action;
import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

public class SkipFirstTimeInterceptor0<R> extends AbstractAction0<R> implements WrapperAction0<R> {
  private final Action0<R> interceptedAction;
  private final SkipFirstTimeInterceptorExecutor<R> executor;

  public SkipFirstTimeInterceptor0(Action0<R> interceptedAction) {
    this(interceptedAction, null);
  }

  public SkipFirstTimeInterceptor0(Action0<R> interceptedAction, R defaultResult) {
    this.interceptedAction = interceptedAction;
    this.executor = new SkipFirstTimeInterceptorExecutor<>(defaultResult);
  }

  @Override
  public Action wrappedAction() {
    return interceptedAction;
  }

  @Override
  public R execute() {
    return executor.execute(interceptedAction::execute);
  }

  @Override
  public int executeReturnInt() {
    return executor.executeReturnInt(interceptedAction::executeReturnInt);
  }

  @Override
  public double executeReturnDouble() {
    return executor.executeReturnDouble(interceptedAction::executeReturnDouble);
  }
}
