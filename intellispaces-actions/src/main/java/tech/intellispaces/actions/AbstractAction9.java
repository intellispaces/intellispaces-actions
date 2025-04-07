package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;
import tech.intellispaces.actions.dataadapter.DataAdapters;
import tech.intellispaces.actions.exception.IrregularActionTypeExceptions;
import tech.intellispaces.actions.wrapper.WrapperAction;
import tech.intellispaces.actions.wrapper.WrapperAction9;

import java.util.function.Function;

public abstract class AbstractAction9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> implements Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> {

  @Override
  public int order() {
    return 9;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] inputs) {
    if (inputs == null || inputs.length != 9) {
      throw IrregularActionTypeExceptions.withMessage("Action form 9 requires nine input data");
    }
    return execute((D1) inputs[0], (D2) inputs[1], (D3) inputs[2], (D4) inputs[3], (D5) inputs[4], (D6) inputs[5], (D7) inputs[6], (D8) inputs[7], (D9) inputs[8]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(Object[] inputs) {
    if (inputs == null || inputs.length != 9) {
      throw IrregularActionTypeExceptions.withMessage("Action form 9 requires nine input data");
    }
    return executeReturnInt((D1) inputs[0], (D2) inputs[1], (D3) inputs[2], (D4) inputs[3], (D5) inputs[4], (D6) inputs[5], (D7) inputs[6], (D8) inputs[7], (D9) inputs[8]);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9) {
    return (Integer) execute(data1, data2, data3, data4, data5, data6, data7, data8, data9);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(Object[] inputs) {
    if (inputs == null || inputs.length != 9) {
      throw IrregularActionTypeExceptions.withMessage("Action form 9 requires nine data");
    }
    return executeReturnDouble((D1) inputs[0], (D2) inputs[1], (D3) inputs[2], (D4) inputs[3], (D5) inputs[4], (D6) inputs[5], (D7) inputs[6], (D8) inputs[7], (D9) inputs[8]);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6, D7 data7, D8 data8, D9 data9) {
    return (Double) execute(data1, data2, data3, data4, data5, data6, data7, data8, data9);
  }

  @Override
  public <_D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> Action8<R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> convertToAction8(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5,
      DataAdapterAction<D6> dataExtractor6,
      DataAdapterAction<D7> dataExtractor7,
      DataAdapterAction<D8> dataExtractor8,
      DataAdapterAction<D9> dataExtractor9
  ) {
    return new Action8ConvertedFromAction9<>(
        this,
        dataExtractor1,
        dataExtractor2,
        dataExtractor3,
        dataExtractor4,
        dataExtractor5,
        dataExtractor6,
        dataExtractor7,
        dataExtractor8,
        dataExtractor9
    );
  }

  @Override
  public Action8<R, D2, D3, D4, D5, D6, D7, D8, D9> convertToAction8(D1 data) {
    return convertToAction8(
        DataAdapters.predefined(data),
        DataAdapters.fixed(0),
        DataAdapters.fixed(1),
        DataAdapters.fixed(2),
        DataAdapters.fixed(3),
        DataAdapters.fixed(4),
        DataAdapters.fixed(5),
        DataAdapters.fixed(6),
        DataAdapters.fixed(7)
    );
  }

  @Override
  public <_R> Action0<_R> castToAction0() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 0");
  }

  @Override
  public <_R, _D> Action1<_R, _D> castToAction1() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 1");
  }

  @Override
  public <_R, _D1, _D2> Action2<_R, _D1, _D2> castToAction2() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 2");
  }

  @Override
  public <_R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> castToAction3() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 3");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> castToAction4() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 4");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> castToAction5() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 5");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> castToAction6() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 6");
  }

  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> Action7<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> castToAction7() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 7");
  }

  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> Action8<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> castToAction8() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 8");
  }

  @SuppressWarnings("unchecked")
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> castToAction9() {
    return (Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9>) this;
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> Action10<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> castToAction10() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 9 can not be represented as action form 10");
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9>, _R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> wrapAction9(
      Function<Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
