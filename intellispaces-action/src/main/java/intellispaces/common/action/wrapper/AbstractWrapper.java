package intellispaces.common.action.wrapper;

import intellispaces.common.action.AbstractAction;
import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.AbstractAction2;
import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.AbstractAction4;
import intellispaces.common.action.AbstractAction5;
import intellispaces.common.action.Action;
import intellispaces.common.action.Action0;
import intellispaces.common.action.Action1;
import intellispaces.common.action.Action2;
import intellispaces.common.action.Action3;
import intellispaces.common.action.Action4;
import intellispaces.common.action.Action5;

/**
 * Abstract general interceptor.
 */
public abstract class AbstractWrapper extends AbstractAction implements Wrapper {
  private final Action wrappedAction;

  public AbstractWrapper(Action action) {
    this.wrappedAction = action;
  }

  @Override
  public Action wrappedAction() {
    return wrappedAction;
  }

  @Override
  public int actionOrder() {
    return wrappedAction.actionOrder();
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    if (wrappedAction.actionOrder() == 0) {
      return new SurrogateAction0<>();
    }
    return super.asAction0();
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    if (wrappedAction.actionOrder() == 1) {
      return new SurrogateAction1<>();
    }
    return super.asAction1();
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    if (wrappedAction.actionOrder() == 2) {
      return new SurrogateAction2<>();
    }
    return super.asAction2();
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    if (wrappedAction.actionOrder() == 3) {
      return new SurrogateAction3<>();
    }
    return super.asAction3();
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    if (wrappedAction.actionOrder() == 4) {
      return new SurrogateAction4<>();
    }
    return super.asAction4();
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    if (wrappedAction.actionOrder() == 5) {
      return new SurrogateAction5<>();
    }
    return super.asAction5();
  }

  private final class SurrogateAction0<$R> extends AbstractAction0<$R> {
    @Override
    @SuppressWarnings("unchecked")
    public $R execute() {
      return ($R) AbstractWrapper.this.execute(new Object[] {});
    }
  }

  private final class SurrogateAction1<$R, $D> extends AbstractAction1<$R, $D> {
    @Override
    @SuppressWarnings("unchecked")
    public $R execute($D data) {
      return ($R) AbstractWrapper.this.execute(new Object[] { data });
    }
  }

  private final class SurrogateAction2<$R, $D1, $D2> extends AbstractAction2<$R, $D1, $D2> {
    @Override
    @SuppressWarnings("unchecked")
    public $R execute($D1 data1, $D2 data2) {
      return ($R) AbstractWrapper.this.execute(new Object[] { data1 ,data2 });
    }
  }

  private final class SurrogateAction3<$R, $D1, $D2, $D3> extends AbstractAction3<$R, $D1, $D2, $D3> {
    @Override
    @SuppressWarnings("unchecked")
    public $R execute($D1 data1, $D2 data2, $D3 data3) {
      return ($R) AbstractWrapper.this.execute(new Object[] { data1 ,data2, data3 });
    }
  }

  private final class SurrogateAction4<$R, $D1, $D2, $D3, $D4> extends AbstractAction4<$R, $D1, $D2, $D3, $D4> {
    @Override
    @SuppressWarnings("unchecked")
    public $R execute($D1 data1, $D2 data2, $D3 data3, $D4 data4) {
      return ($R) AbstractWrapper.this.execute(new Object[] { data1 ,data2, data3, data4 });
    }
  }

  private final class SurrogateAction5<$R, $D1, $D2, $D3, $D4, $D5> extends AbstractAction5<$R, $D1, $D2, $D3, $D4, $D5> {
    @Override
    @SuppressWarnings("unchecked")
    public $R execute($D1 data1, $D2 data2, $D3 data3, $D4 data4, $D5 data5) {
      return ($R) AbstractWrapper.this.execute(new Object[] { data1 ,data2, data3, data4, data5 });
    }
  }
}
