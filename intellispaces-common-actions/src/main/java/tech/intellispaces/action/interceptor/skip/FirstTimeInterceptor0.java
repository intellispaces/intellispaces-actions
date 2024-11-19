package tech.intellispaces.action.interceptor.skip;

import tech.intellispaces.action.AbstractAction0;
import tech.intellispaces.action.Action;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.wrapper.WrapperAction0;

class FirstTimeInterceptor0<R> extends AbstractAction0<R> implements WrapperAction0<R> {
  private final Action0<R> interceptedAction;
  private final FirstTimeInterceptorExecutor<R> executor = new FirstTimeInterceptorExecutor<>();

  FirstTimeInterceptor0(Action0<R> interceptedAction) {
    this.interceptedAction = interceptedAction;
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
