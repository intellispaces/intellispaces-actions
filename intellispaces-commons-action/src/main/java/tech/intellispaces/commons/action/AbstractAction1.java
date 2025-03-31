package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.dataadapter.DataAdapterAction;
import tech.intellispaces.commons.action.dataadapter.DataAdapters;
import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.wrapper.WrapperAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction1;

import java.util.function.Function;

public abstract class AbstractAction1<R, D> implements Action1<R, D> {

  @Override
  public int order() {
    return 1;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] inputs) {
    if (inputs == null || inputs.length != 1) {
      throw IrregularActionTypeExceptions.withMessage("Action form 1 requires single input data");
    }
    return execute((D) inputs[0]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(Object[] inputs) {
    if (inputs == null || inputs.length != 1) {
      throw IrregularActionTypeExceptions.withMessage("Action form 1 requires single input data");
    }
    return executeReturnInt((D) inputs[0]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(Object[] inputs) {
    if (inputs == null || inputs.length != 1) {
      throw IrregularActionTypeExceptions.withMessage("Action form 1 requires single input data");
    }
    return executeReturnDouble((D) inputs[0]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data) {
    return execute((D) Integer.valueOf(data));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data) {
    return execute((D) Double.valueOf(data));
  }

  @Override
  public int executeReturnInt(D data) {
    return (Integer) execute(data);
  }

  @Override
  public int executeReturnInt(int data) {
    return (Integer) execute(data);
  }

  @Override
  public int executeReturnInt(double data) {
    return (Integer) execute(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return (Double) execute(data);
  }

  @Override
  public double executeReturnDouble(int data) {
    return (Double) execute(data);
  }

  @Override
  public double executeReturnDouble(double data) {
    return (Double) execute(data);
  }

  @Override
  public <_R> Action0<_R> castToAction0() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 0");
  }

  @Override
  @SuppressWarnings("unchecked")
  public <_R, _D> Action1<_R, _D> castToAction1() {
    return (Action1<_R, _D>) this;
  }

  @Override
  public <_R, _D1, _D2> Action2<_R, _D1, _D2> castToAction2() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 2");
  }

  @Override
  public <_R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> castToAction3() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 3");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> castToAction4() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 4");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> castToAction5() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 5");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> castToAction6() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 6");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> Action7<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> castToAction7() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 7");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> Action8<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> castToAction8() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 8");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> castToAction9() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 8");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> Action10<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> castToAction10() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 1 can not be represented as action form 10");
  }

  @Override
  public Action0<R> convertToAction0(DataAdapterAction<D> dataExtractor) {
    return new Action0ConvertedFromAction1<>(this, dataExtractor);
  }

  @Override
  public Action0<R> convertToAction0(D data) {
    return convertToAction0(DataAdapters.predefined(data));
  }

  @Override
  public Action2<R, D, Void> convertToAction2() {
    return new Action2BasedOnAction1<>(this);
  }

  @Override
  public Action3<R, D, Void, Void> convertToAction3() {
    return new Action3BasedOnAction1<>(this);
  }

  @Override
  public Action4<R, D, Void, Void, Void> convertToAction4() {
    return new Action4BasedOnAction1<>(this);
  }

  @Override
  public Action5<R, D, Void, Void, Void, Void> convertToAction5() {
    return new Action5BasedOnAction1<>(this);
  }

  @Override
  public Action6<R, D, Void, Void, Void, Void, Void> convertToAction6() {
    return new Action6BasedOnAction1<>(this);
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction1<_R, _D>, _R, _D> Action1<_R, _D> wrapAction1(
      Function<Action1<R, D>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
