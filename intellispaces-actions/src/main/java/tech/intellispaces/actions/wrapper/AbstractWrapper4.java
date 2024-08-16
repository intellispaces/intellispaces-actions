package tech.intellispaces.actions.wrapper;

import tech.intellispaces.actions.AbstractAction4;
import tech.intellispaces.actions.Action4;

public abstract class AbstractWrapper4<R, D1, D2, D3, D4>
    extends AbstractAction4<R, D1, D2, D3, D4>
    implements Wrapper4<R, D1, D2, D3, D4>
{
  private final Action4<R, D1, D2, D3, D4> wrappedAction;

  public AbstractWrapper4(Action4<R, D1, D2, D3, D4> action) {
    this.wrappedAction = action;
  }

  @Override
  public Action4<R, D1, D2, D3, D4> wrappedAction() {
    return wrappedAction;
  }
}
