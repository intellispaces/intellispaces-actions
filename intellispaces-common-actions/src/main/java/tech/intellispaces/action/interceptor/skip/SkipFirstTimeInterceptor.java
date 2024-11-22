package tech.intellispaces.action.interceptor.skip;

import tech.intellispaces.action.AbstractAction;
import tech.intellispaces.action.Action;
import tech.intellispaces.action.wrapper.WrapperAction;

class SkipFirstTimeInterceptor extends AbstractAction implements WrapperAction {
  private final Action interceptedAction;
  private final SkipFirstTimeInterceptorExecutor<Object> executor = new SkipFirstTimeInterceptorExecutor<>();

  SkipFirstTimeInterceptor(Action interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public int order() {
    return interceptedAction.order();
  }

  @Override
  public Action wrappedAction() {
    return interceptedAction;
  }

  @Override
  public Object execute(Object[] inputs) {
    return executor.execute(() -> interceptedAction.execute(inputs));
  }

  @Override
  public int executeReturnInt(Object[] inputs) {
    return executor.executeReturnInt(() -> interceptedAction.executeReturnInt(inputs));
  }

  @Override
  public double executeReturnDouble(Object[] inputs) {
    return executor.executeReturnDouble(() -> interceptedAction.executeReturnDouble(inputs));
  }
}
