package tech.intellispaces.actions;

import tech.intellispaces.actions.wrapper.Wrapper;
import tech.intellispaces.actions.wrapper.Wrapper3;
import tech.intellispaces.actions.wrapper.Wrapper4;
import tech.intellispaces.actions.wrapper.Wrapper5;
import tech.intellispaces.commons.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction3<R, D1, D2, D3> implements Action3<R, D1, D2, D3> {

  @Override
  public int actionOrder() {
    return 3;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4) {
    return execute(data1, data2, data3);
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return execute(data1, data2, data3);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object... data) {
    if (data == null || data.length != 3) {
      throw UnexpectedViolationException.withMessage("Action2 expects three input data parameters");
    }
    return execute((D1) data[0], (D2) data[1], (D3) data[2]);
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action0");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action2");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action3<R, D1, D2, D3> asAction3() {
    return this;
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action5");
  }

  @Override
  public <A extends Wrapper> A wrapAction(Function<Action, A> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<R, D1, D2, D3>> W wrapAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<R, D1, D2, D3, Void>> W wrapAction4(
      Function<Action4<R, D1, D2, D3, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<R, D1, D2, D3, Void, Void>> W wrapAction5(
      Function<Action5<R, D1, D2, D3, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> W convertAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W convertAction4(
      Function<Action4<R, D1, D2, D3, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D1, D2, D3, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
