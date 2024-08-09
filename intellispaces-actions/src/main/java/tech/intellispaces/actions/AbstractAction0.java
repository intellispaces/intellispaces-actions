package tech.intellispaces.actions;

import tech.intellispaces.commons.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction0<R> implements Action0<R> {

  @Override
  public R execute(Void data) {
    return execute();
  }

  @Override
  public R execute(Void data1, Void data2) {
    return execute();
  }

  @Override
  public R execute(Void data1, Void data2, Void data3) {
    return execute();
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4) {
    return execute();
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, Void data5) {
    return execute();
  }

  @Override
  public R execute(Object... data) {
    if (data != null && data.length > 0) {
      throw UnexpectedViolationException.withMessage("Action0 does not expect any input data");
    }
    return execute();
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action0<R> asAction0() {
    return this;
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action0 can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action0 can not be casted to Action2");
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action0 can not be casted to Action3");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action0 can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action0 can not be casted to Action5");
  }

  @Override
  public <A extends Action0<_R>, _R> A wrapAction0(Function<Action0<R>, A> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action1<_R, _D>, _R, _D> A wrapAction1(Function<Action1<R, Void>, A> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action2<_R, _D1, _D2>, _R, _D1, _D2> A wrapAction2(
      Function<Action2<R, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> A wrapAction3(
      Function<Action3<R, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> A wrapAction4(
      Function<Action4<R, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction5(
      Function<Action5<R, Void, Void, Void, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
