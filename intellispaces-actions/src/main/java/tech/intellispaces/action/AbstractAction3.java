package tech.intellispaces.action;

import tech.intellispaces.action.dataadapter.DataAdapterAction;
import tech.intellispaces.action.dataadapter.DataAdapters;
import tech.intellispaces.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.action.wrapper.WrapperAction;
import tech.intellispaces.action.wrapper.WrapperAction3;

import java.util.function.Function;

public abstract class AbstractAction3<R, D1, D2, D3> implements Action3<R, D1, D2, D3> {

  @Override
  public int order() {
    return 3;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] inputs) {
    if (inputs == null || inputs.length != 3) {
      throw IrregularActionTypeExceptions.withMessage("Action form 3 requires three input data");
    }
    return execute((D1) inputs[0], (D2) inputs[1], (D3) inputs[2]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(Object[] inputs) {
    if (inputs == null || inputs.length != 3) {
      throw IrregularActionTypeExceptions.withMessage("Action form 3 requires three input data");
    }
    return executeReturnInt((D1) inputs[0], (D2) inputs[1], (D3) inputs[2]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(Object[] inputs) {
    if (inputs == null || inputs.length != 3) {
      throw IrregularActionTypeExceptions.withMessage("Action form 3 requires three input data");
    }
    return executeReturnDouble((D1) inputs[0], (D2) inputs[1], (D3) inputs[2]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, int data3) {
    return execute(data1, data2, (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, double data3) {
    return execute(data1, data2, (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, int data3) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, double data3) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, int data3) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, double data3) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, int data3) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, double data3) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, int data3) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, double data3) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, int data3) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, double data3) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, int data3) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, double data3) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    return executeReturnInt(data1, data2, (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    return executeReturnInt(data1, data2, (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2, int data3) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2, double data3) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, double data2, double data3) {
    return executeReturnInt(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3) {
    return (Integer) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    return executeReturnDouble(data1, data2, (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return executeReturnDouble(data1, data2, (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2, int data3) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2, double data3) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, double data2, double data3) {
    return executeReturnDouble(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3) {
    return (Double) execute(data1, data2, data3);
  }

  @Override
  public <_R> Action0<_R> castToAction0() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 3 can not be represented as action form 0");
  }

  @Override
  public <_R, _D> Action1<_R, _D> castToAction1() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 3 can not be represented as action form 1");
  }

  @Override
  public <_R, _D1, _D2> Action2<_R, _D1, _D2> castToAction2() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 3 can not be represented as action form 2");
  }

  @Override
  @SuppressWarnings("unchecked")
  public <_R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> castToAction3() {
    return (Action3<_R, _D1, _D2, _D3>) this;
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> castToAction4() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 3 can not be represented as action form 4");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> castToAction5() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 3 can not be represented as action form 5");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> castToAction6() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 3 can not be represented as action form 6");
  }

  @Override
  public <_D> Action1<R, _D> convertToAction1(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3
  ) {
    return new Action1BasedOnAction3<>(this, dataExtractor1, dataExtractor2, dataExtractor3);
  }

  @Override
  public <_D1, _D2> Action2<R, _D1, _D2> convertToAction2(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3
  ) {
    return new Action2ConvertedFromAction3<>(this, dataExtractor1, dataExtractor2, dataExtractor3);
  }

  @Override
  public Action2<R, D2, D3> convertToAction2(D1 data) {
    return convertToAction2(
        DataAdapters.predefined(data),
        DataAdapters.direct(),
        DataAdapters.direct()
    );
  }

  @Override
  public Action4<R, D1, D2, D3, Void> convertToAction4() {
    return new Action4BasedOnAction3<>(this);
  }

  @Override
  public Action5<R, D1, D2, D3, Void, Void> convertToAction5() {
    return new Action5BasedOnAction3<>(this);
  }

  @Override
  public Action6<R, D1, D2, D3, Void, Void, Void> convertToAction6() {
    return new Action6BasedOnAction3<>(this);
  }

  @Override
  public <A extends WrapperAction> A wrapAction(Function<Action, A> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> wrapAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
