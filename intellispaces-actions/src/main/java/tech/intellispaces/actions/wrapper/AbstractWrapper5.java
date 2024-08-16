package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction5;
import tech.intellispaces.actions.Action5;

public abstract class AbstractWrapper5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Wrapper5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> interceptedAction;

  public AbstractWrapper5(Action5<R, D1, D2, D3, D4, D5> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> wrappedAction() {
    return interceptedAction;
  }
}
