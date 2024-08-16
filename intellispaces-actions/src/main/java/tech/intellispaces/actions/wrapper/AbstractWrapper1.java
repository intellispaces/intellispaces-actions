package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction1;
import tech.intellispaces.actions.Action1;

public abstract class AbstractWrapper1<R, D>
    extends AbstractAction1<R, D>
    implements Wrapper1<R, D>
{
  private final Action1<R, D> interceptedAction;

  public AbstractWrapper1(Action1<R, D> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action1<R, D> wrappedAction() {
    return interceptedAction;
  }
}
