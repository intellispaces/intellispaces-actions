package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction5;
import intellispaces.common.action.Action5;

public abstract class AbstractWrapper5<R, D1, D2, D3, D4, D5>
    extends AbstractAction5<R, D1, D2, D3, D4, D5>
    implements Wrapper5<R, D1, D2, D3, D4, D5>
{
  private final Action5<R, D1, D2, D3, D4, D5> wrappedAction;

  public AbstractWrapper5(Action5<R, D1, D2, D3, D4, D5> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action5<R, D1, D2, D3, D4, D5> wrappedAction() {
    return wrappedAction;
  }
}
