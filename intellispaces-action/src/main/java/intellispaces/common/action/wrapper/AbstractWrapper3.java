package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;

public abstract class AbstractWrapper3<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements Wrapper3<R, D1, D2, D3>
{
  private final Action3<R, D1, D2, D3> wrappedAction;

  public AbstractWrapper3(Action3<R, D1, D2, D3> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action3<R, D1, D2, D3> wrappedAction() {
    return wrappedAction;
  }
}
