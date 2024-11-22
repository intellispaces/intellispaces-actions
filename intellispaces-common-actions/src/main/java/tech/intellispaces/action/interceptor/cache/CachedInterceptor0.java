package tech.intellispaces.action.interceptor.cache;

import tech.intellispaces.action.AbstractAction0;
import tech.intellispaces.action.Action;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.wrapper.WrapperAction0;

class CachedInterceptor0<R> extends AbstractAction0<R> implements WrapperAction0<R> {
  private final Action0<R> interceptedAction;

  private R cachedValue = null;
  private int cachedIntValue;
  private double cachedDoubleValue;

  private boolean isCachedValue = false;
  private boolean isCachedIntValue = false;
  private boolean isCachedDoubleValue = false;

  CachedInterceptor0(Action0<R> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action wrappedAction() {
    return interceptedAction;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute() {
    if (isCachedValue) {
      return cachedValue;
    }
    if (isCachedIntValue) {
      cachedValue = (R) Integer.valueOf(cachedIntValue);
    } else if (isCachedDoubleValue) {
      cachedValue = (R) Double.valueOf(cachedDoubleValue);
    } else {
      cachedValue = interceptedAction.execute();
    }
    isCachedValue = true;
    return cachedValue;
  }

  @Override
  public int executeReturnInt() {
    if (isCachedIntValue) {
      return cachedIntValue;
    }
    if (isCachedValue) {
      cachedIntValue = (Integer) cachedValue;
      isCachedIntValue = true;
      return cachedIntValue;
    }
    cachedIntValue = interceptedAction.executeReturnInt();
    isCachedIntValue = true;
    return cachedIntValue;
  }

  @Override
  public double executeReturnDouble() {
    if (isCachedDoubleValue) {
      return cachedDoubleValue;
    }
    if (isCachedValue) {
      cachedDoubleValue = (Double) cachedValue;
      isCachedDoubleValue = true;
      return cachedDoubleValue;
    }
    cachedDoubleValue = interceptedAction.executeReturnDouble();
    isCachedDoubleValue = true;
    return cachedDoubleValue;
  }
}
