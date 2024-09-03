package intellispaces.common.action;

import intellispaces.common.action.wrapper.Wrapper;
import intellispaces.common.action.wrapper.Wrapper5;
import intellispaces.common.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction5<R, D1, D2, D3, D4, D5> implements Action5<R, D1, D2, D3, D4, D5> {

  @Override
  public int actionOrder() {
    return 5;
  }

  @Override
  public R execute() {
    throw UnexpectedViolationException.withMessage("Action5 expects five input data parameters");
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] data) {
    if (data == null || data.length != 5) {
      throw UnexpectedViolationException.withMessage("Action5 expects five input data parameters");
    }
    return execute((D1) data[0], (D2) data[1], (D3) data[2], (D4) data[3], (D5) data[4]);
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action5 can not be casted to Action0");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action5 can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action5 can not be casted to Action2");
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action5 can not be casted to Action3");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action5 can not be casted to Action4");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action5<R, D1, D2, D3, D4, D5> asAction5() {
    return this;
  }

  @Override
  public <W extends Wrapper> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<R, D1, D2, D3, D4, D5>> W wrapAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
