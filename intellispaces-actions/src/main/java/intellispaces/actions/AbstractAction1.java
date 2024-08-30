package intellispaces.actions;

import intellispaces.actions.wrapper.Wrapper;
import intellispaces.actions.wrapper.Wrapper1;
import intellispaces.actions.wrapper.Wrapper2;
import intellispaces.actions.wrapper.Wrapper3;
import intellispaces.actions.wrapper.Wrapper4;
import intellispaces.actions.wrapper.Wrapper5;
import intellispaces.commons.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction1<R, D> implements Action1<R, D> {

  @Override
  public int actionOrder() {
    return 1;
  }

  @Override
  public R execute() {
    throw UnexpectedViolationException.withMessage("Action1 expects one input data parameter");
  }

  @Override
  public R execute(D data1, Void data2) {
    return execute(data1);
  }

  @Override
  public R execute(D data1, Void data2, Void data3) {
    return execute(data1);
  }

  @Override
  public R execute(D data1, Void data2, Void data3, Void data4) {
    return execute(data1);
  }

  @Override
  public R execute(D data1, Void data2, Void data3, Void data4, Void data5) {
    return execute(data1);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] data) {
    if (data == null || data.length != 1) {
      throw UnexpectedViolationException.withMessage("Action1 expects one input data parameter");
    }
    return execute((D) data[0]);
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action1 can not be casted to Action0");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action1<R, D> asAction1() {
    return this;
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action1 can not be casted to Action2");
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action1 can not be casted to Action3");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action1 can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action1 can not be casted to Action5");
  }

  @Override
  public <W extends Wrapper> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper1<R, D>> W wrapAction1(
      Function<Action1<R, D>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper2<R, D, Void>> W wrapAction2(
      Function<Action2<R, D, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<R, D, Void, Void>> W wrapAction3(
      Function<Action3<R, D, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<R, D, Void, Void, Void>> W wrapAction4(
      Function<Action4<R, D, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<R, D, Void, Void, Void, Void>> W wrapAction5(
      Function<Action5<R, D, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper1<_R, _D>, _R, _D> W convertAction1(
      Function<Action1<R, D>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper2<_R, _D1, _D2>, _R, _D1, _D2> W convertAction2(
      Function<Action2<R, D, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> W convertAction3(
      Function<Action3<R, D, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W convertAction4(
      Function<Action4<R, D, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
