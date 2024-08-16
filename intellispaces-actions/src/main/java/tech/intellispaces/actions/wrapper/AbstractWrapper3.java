package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction3;
import tech.intellispaces.actions.Action3;

public abstract class AbstractWrapper3<R, D1, D2, D3>
    extends AbstractAction3<R, D1, D2, D3>
    implements Wrapper3<R, D1, D2, D3>
{
  private final Action3<R, D1, D2, D3> interceptedAction;

  public AbstractWrapper3(Action3<R, D1, D2, D3> interceptedAction) {
    this.interceptedAction = interceptedAction;
  }

  @Override
  public Action3<R, D1, D2, D3> wrappedAction() {
    return interceptedAction;
  }
}
