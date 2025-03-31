package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.dataadapter.DataAdapterAction;
import tech.intellispaces.commons.action.dataadapter.DataAdapters;
import tech.intellispaces.commons.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.commons.action.wrapper.WrapperAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction2;

import java.util.function.Function;

public abstract class AbstractAction2<R, D1, D2> implements Action2<R, D1, D2> {

  @Override
  public int order() {
    return 2;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] inputs) {
    if (inputs == null || inputs.length != 2) {
      throw IrregularActionTypeExceptions.withMessage("Action form 2 requires two input data");
    }
    return execute((D1) inputs[0], (D2) inputs[1]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(Object[] inputs) {
    if (inputs == null || inputs.length != 2) {
      throw IrregularActionTypeExceptions.withMessage("Action form 2 requires two input data");
    }
    return executeReturnInt((D1) inputs[0], (D2) inputs[1]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(Object[] inputs) {
    if (inputs == null || inputs.length != 2) {
      throw IrregularActionTypeExceptions.withMessage("Action form 2 requires two input data");
    }
    return executeReturnDouble((D1) inputs[0], (D2) inputs[1]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2) {
    return execute(data1, (D2) Integer.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2) {
    return execute(data1, (D2) Double.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return (Integer) execute(data1, data2);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, double data2) {
    return executeReturnInt(data1, (D2) Double.valueOf(data2));
  }

  @Override
  public int executeReturnInt(int data1, int data2) {
    return (Integer) execute(data1, data2);
  }

  @Override
  public int executeReturnInt(int data1, double data2) {
    return (Integer) execute(data1, data2);
  }

  @Override
  public int executeReturnInt(double data1, int data2) {
    return (Integer) execute(data1, data2);
  }

  @Override
  public int executeReturnInt(double data1, double data2) {
    return (Integer) execute(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2) {
    return (Double) execute(data1, data2);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, double data2) {
    return executeReturnDouble(data1, (D2) Double.valueOf(data2));
  }

  @Override
  public double executeReturnDouble(int data1, int data2) {
    return (Double) execute(data1, data2);
  }

  @Override
  public double executeReturnDouble(int data1, double data2) {
    return (Double) execute(data1, data2);
  }

  @Override
  public double executeReturnDouble(double data1, int data2) {
    return (Double) execute(data1, data2);
  }

  @Override
  public double executeReturnDouble(double data1, double data2) {
    return (Double) execute(data1, data2);
  }

  @Override
  public <_R> Action0<_R> castToAction0() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 0");
  }

  @Override
  public <_R, _D> Action1<_R, _D> castToAction1() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 1");
  }

  @Override
  @SuppressWarnings("unchecked")
  public <_R, _D1, _D2> Action2<_R, _D1, _D2> castToAction2() {
    return (Action2<_R, _D1, _D2>) this;
  }

  @Override
  public <_R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> castToAction3() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 3");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> castToAction4() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 4");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> castToAction5() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 5");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> castToAction6() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 6");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> Action7<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> castToAction7() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 7");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> Action8<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> castToAction8() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 8");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> castToAction9() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 8");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> Action10<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> castToAction10() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 2 can not be represented as action form 10");
  }

  @Override
  public <_D> Action1<R, _D> convertToAction1(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2
  ) {
    return new Action1ConvertedFromAction2<>(this, dataExtractor1, dataExtractor2);
  }

  @Override
  public Action1<R, D2> convertToAction1(D1 data) {
    return convertToAction1(
        DataAdapters.predefined(data),
        DataAdapters.fixed(0)
    );
  }

  @Override
  public Action3<R, D1, D2, Void> convertToAction3() {
    return new Action3BasedOnAction2<>(this);
  }

  @Override
  public Action4<R, D1, D2, Void, Void> convertToAction4() {
    return new Action4BasedOnAction2<>(this);
  }

  @Override
  public Action5<R, D1, D2, Void, Void, Void> convertToAction5() {
    return new Action5BasedOnAction2<>(this);
  }

  @Override
  public Action6<R, D1, D2, Void, Void, Void, Void> convertToAction6() {
    return new Action6BasedOnAction2<>(this);
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction2<_R, _D1, _D2>, _R, _D1, _D2> Action2<_R, _D1, _D2> wrapAction2(
      Function<Action2<R, D1, D2>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
