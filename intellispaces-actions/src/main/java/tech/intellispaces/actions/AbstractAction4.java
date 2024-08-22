package tech.intellispaces.actions;

import tech.intellispaces.actions.wrapper.Wrapper;
import tech.intellispaces.actions.wrapper.Wrapper4;
import tech.intellispaces.actions.wrapper.Wrapper5;
import tech.intellispaces.commons.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction4<R, D1, D2, D3, D4> implements Action4<R, D1, D2, D3, D4> {

  @Override
  public int actionOrder() {
    return 4;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, Void data5) {
    return execute(data1, data2, data3, data4);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object... data) {
    if (data == null || data.length != 4) {
      throw UnexpectedViolationException.withMessage("Action2 expects four input data parameters");
    }
    return execute((D1) data[0], (D2) data[1], (D3) data[2], (D4) data[3]);
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action4 can not be casted to Action0");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action4 can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action4 can not be casted to Action2");
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action4 can not be casted to Action3");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action4<R, D1, D2, D3, D4> asAction4() {
    return this;
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action4 can not be casted to Action5");
  }

  @Override
  public <W extends Wrapper> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<R, D1, D2, D3, D4>> W wrapAction4(
      Function<Action4<R, D1, D2, D3, D4>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<R, D1, D2, D3, D4, Void>> W wrapAction5(
      Function<Action5<R, D1, D2, D3, D4, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W convertAction4(
      Function<Action4<R, D1, D2, D3, D4>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D1, D2, D3, D4, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
