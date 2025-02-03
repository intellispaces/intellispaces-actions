package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.wrapper.WrapperAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction0;

import java.util.function.Function;

public abstract class AbstractAction0<R> implements Action0<R> {

  @Override
  public int order() {
    return 0;
  }

  @Override
  public R execute(Object[] inputs) {
    if (inputs != null && inputs.length > 0) {
      throw IrregularActionTypeExceptions.withMessage("Action form 0 does not require any input data");
    }
    return execute();
  }

  @Override
  public int executeReturnInt(Object[] inputs) {
    if (inputs != null && inputs.length > 0) {
      throw IrregularActionTypeExceptions.withMessage("Action form 0 does not require any input data");
    }
    return executeReturnInt();
  }

  @Override
  public double executeReturnDouble(Object[] inputs) {
    if (inputs != null && inputs.length > 0) {
      throw IrregularActionTypeExceptions.withMessage("Action form 0 does not require any input data");
    }
    return executeReturnDouble();
  }

  @Override
  public int executeReturnInt() {
    return (Integer) execute();
  }

  @Override
  public double executeReturnDouble() {
    return (Double) execute();
  }

  @Override
  @SuppressWarnings("unchecked")
  public <_R> Action0<_R> castToAction0() {
    return (Action0<_R>) this;
  }

  @Override
  public <_R, _D> Action1<_R, _D> castToAction1() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 0 can not be represented as action form 1");
  }

  @Override
  public <_R, _D1, _D2> Action2<_R, _D1, _D2> castToAction2() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 0 can not be represented as action form 2");
  }

  @Override
  public <_R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> castToAction3() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 0 can not be represented as action form 3");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> castToAction4() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 0 can not be represented as action form 4");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> castToAction5() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 0 can not be represented as action form 5");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> castToAction6() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 0 can not be represented as action form 6");
  }

  @Override
  public Action1<R, Void> convertToAction1() {
    return new Action1BasedOnAction0<>(this);
  }

  @Override
  public Action2<R, Void, Void> convertToAction2() {
    return new Action2BasedOnAction0<>(this);
  }

  @Override
  public Action3<R, Void, Void, Void> convertToAction3() {
    return new Action3BasedOnAction0<>(this);
  }

  @Override
  public Action4<R, Void, Void, Void, Void> convertToAction4() {
    return new Action4BasedOnAction0<>(this);
  }

  @Override
  public Action5<R, Void, Void, Void, Void, Void> convertToAction5() {
    return new Action5BasedOnAction0<>(this);
  }

  @Override
  public Action6<R, Void, Void, Void, Void, Void, Void> convertToAction6() {
    return new Action6BasedOnAction0<>(this);
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction0<_R>, _R> Action0<_R> wrapAction0(Function<Action0<R>, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }
}
