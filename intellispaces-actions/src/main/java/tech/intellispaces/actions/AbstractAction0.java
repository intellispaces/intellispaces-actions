package tech.intellispaces.actions;

import tech.intellispaces.actions.wrapper.Wrapper;
import tech.intellispaces.actions.wrapper.Wrapper0;
import tech.intellispaces.actions.wrapper.Wrapper1;
import tech.intellispaces.actions.wrapper.Wrapper2;
import tech.intellispaces.actions.wrapper.Wrapper3;
import tech.intellispaces.actions.wrapper.Wrapper4;
import tech.intellispaces.actions.wrapper.Wrapper5;
import tech.intellispaces.commons.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction0<R> implements Action0<R> {

  @Override
  public int actionOrder() {
    return 0;
  }

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
  public <W extends Wrapper> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper0<_R>, _R> W convertAction0(Function<Action0<R>, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper0<R>> W wrapAction0(
      Function<Action0<R>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper1<R, Void>> W wrapAction1(
      Function<Action1<R, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper2<R, Void, Void>> W wrapAction2(
      Function<Action2<R, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<R, Void, Void, Void>> W wrapAction3(
      Function<Action3<R, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<R, Void, Void, Void, Void>> W wrapAction4(
      Function<Action4<R, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<R, Void, Void, Void, Void, Void>> W wrapAction5(
      Function<Action5<R, Void, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper1<_R, _D>, _R, _D> W convertAction1(
      Function<Action1<R, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper2<_R, _D1, _D2>, _R, _D1, _D2> W convertAction2(
      Function<Action2<R, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> W convertAction3(
      Function<Action3<R, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W convertAction4(
      Function<Action4<R, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, Void, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
