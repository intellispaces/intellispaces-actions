package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction2;
import tech.intellispaces.actions.Action2;

public abstract class AbstractWrapper2<R, D1, D2>
    extends AbstractAction2<R, D1, D2>
    implements Wrapper2<R, D1, D2>
{
  private final Action2<R, D1, D2> interceptedAction;

  public AbstractWrapper2(Action2<R, D1, D2> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action2<R, D1, D2> wrappedAction() {
    return interceptedAction;
  }
}
