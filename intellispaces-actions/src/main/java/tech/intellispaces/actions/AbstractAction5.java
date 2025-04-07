package tech.intellispaces.actions;

import tech.intellispaces.actions.dataadapter.DataAdapterAction;
import tech.intellispaces.actions.dataadapter.DataAdapters;
import tech.intellispaces.actions.exception.IrregularActionTypeExceptions;
import tech.intellispaces.actions.wrapper.WrapperAction;
import tech.intellispaces.actions.wrapper.WrapperAction5;

import java.util.function.Function;

public abstract class AbstractAction5<R, D1, D2, D3, D4, D5> implements Action5<R, D1, D2, D3, D4, D5> {

  @Override
  public int order() {
    return 5;
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] inputs) {
    if (inputs == null || inputs.length != 5) {
      throw IrregularActionTypeExceptions.withMessage("Action form 5 requires five input data");
    }
    return execute((D1) inputs[0], (D2) inputs[1], (D3) inputs[2], (D4) inputs[3], (D5) inputs[4]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(Object[] inputs) {
    if (inputs == null || inputs.length != 5) {
      throw IrregularActionTypeExceptions.withMessage("Action form 5 requires five input data");
    }
    return executeReturnInt((D1) inputs[0], (D2) inputs[1], (D3) inputs[2], (D4) inputs[3], (D5) inputs[4]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(Object[] inputs) {
    if (inputs == null || inputs.length != 5) {
      throw IrregularActionTypeExceptions.withMessage("Action form 5 requires five input data");
    }
    return executeReturnDouble((D1) inputs[0], (D2) inputs[1], (D3) inputs[2], (D4) inputs[3], (D5) inputs[4]);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return execute(data1, data2, data3, data4, (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return execute(data1, data2, data3, data4, (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return execute(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return execute(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, double data4, int data5) {
    return execute(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return execute(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, int data3, int data4, int data5) {
    return execute(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, int data3, int data4, double data5) {
    return execute(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, int data3, double data4, int data5) {
    return execute(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, int data3, double data4, double data5) {
    return execute(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, double data3, int data4, int data5) {
    return execute(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, double data3, int data4, double data5) {
    return execute(data1, data2, (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, double data3, double data4, int data5) {
    return execute(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, D2 data2, double data3, double data4, double data5) {
    return execute(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, int data3, int data4, int data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, int data3, int data4, double data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, int data3, double data4, int data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, int data3, double data4, double data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, double data3, int data4, int data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, double data3, int data4, double data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, double data3, double data4, int data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, int data2, double data3, double data4, double data5) {
    return execute(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, int data3, int data4, int data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, int data3, int data4, double data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, int data3, double data4, int data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, int data3, double data4, double data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, double data3, int data4, int data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, double data3, int data4, double data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, double data3, double data4, int data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(D1 data1, double data2, double data3, double data4, double data5) {
    return execute(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, int data3, int data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, int data3, int data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, int data3, double data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, int data3, double data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, double data3, int data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, double data3, int data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, double data3, double data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, int data2, double data3, double data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, int data3, int data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, int data3, int data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, int data3, double data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, int data3, double data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, double data3, int data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, double data3, int data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, double data3, double data4, int data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(int data1, double data2, double data3, double data4, double data5) {
    return execute((D1) Integer.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, int data3, int data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, int data3, int data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, int data3, double data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, int data3, double data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, double data3, int data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, double data3, int data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, double data3, double data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, int data2, double data3, double data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, int data3, int data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, int data3, int data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, int data3, double data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, int data3, double data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, double data3, int data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, double data3, int data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, double data3, double data4, int data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(double data1, double data2, double data3, double data4, double data5) {
    return execute((D1) Double.valueOf(data1), (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return executeReturnInt(data1, data2, data3, data4, (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return executeReturnInt(data1, data2, data3, data4, (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return executeReturnInt(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return executeReturnInt(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return executeReturnInt(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    return executeReturnInt(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    return executeReturnInt(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    return executeReturnInt(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    return executeReturnInt(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    return executeReturnInt(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    return executeReturnInt(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, int data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, int data2, double data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, int data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(int data1, double data2, double data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, int data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, int data2, double data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, int data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, int data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4, int data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public int executeReturnInt(double data1, double data2, double data3, double data4, double data5) {
    return (Integer) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4, double data5) {
    return executeReturnDouble(data1, data2, data3, data4, (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    return executeReturnDouble(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    return executeReturnDouble(data1, data2, data3, (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    return executeReturnDouble(data1, data2, data3, (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    return executeReturnDouble(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    return executeReturnDouble(data1, data2, (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    return executeReturnDouble(data1, data2, (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    return executeReturnDouble(data1, data2, (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Integer.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Integer.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2), (D3) Integer.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    return executeReturnDouble(data1, (D2) Integer.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  @SuppressWarnings("unchecked")
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    return executeReturnDouble(data1, (D2) Double.valueOf(data2), (D3) Double.valueOf(data3), (D4) Double.valueOf(data4), (D5) Double.valueOf(data5));
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, int data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, int data2, double data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, int data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(int data1, double data2, double data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, int data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, int data2, double data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, int data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, int data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4, int data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public double executeReturnDouble(double data1, double data2, double data3, double data4, double data5) {
    return (Double) execute(data1, data2, data3, data4, data5);
  }

  @Override
  public <_R> Action0<_R> castToAction0() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 0");
  }

  @Override
  public <_R, _D> Action1<_R, _D> castToAction1() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 1");
  }

  @Override
  public <_R, _D1, _D2> Action2<_R, _D1, _D2> castToAction2() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 2");
  }

  @Override
  public <_R, _D1, _D2, _D3> Action3<_R, _D1, _D2, _D3> castToAction3() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 3");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4> Action4<_R, _D1, _D2, _D3, _D4> castToAction4() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 4");
  }

  @Override
  @SuppressWarnings("unchecked")
  public <_R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> castToAction5() {
    return (Action5<_R, _D1, _D2, _D3, _D4, _D5>) this;
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6> Action6<_R, _D1, _D2, _D3, _D4, _D5, _D6> castToAction6() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 6");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> Action7<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7> castToAction7() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 7");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> Action8<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8> castToAction8() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 8");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> Action9<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9> castToAction9() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 8");
  }

  @Override
  public <_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> Action10<_R, _D1, _D2, _D3, _D4, _D5, _D6, _D7, _D8, _D9, _D10> castToAction10() {
    throw IrregularActionTypeExceptions.withMessage("Action of form 5 can not be represented as action form 10");
  }

  @Override
  public <_D1, _D2, _D3, _D4> Action4<R, _D1, _D2, _D3, _D4> convertToAction4(
      DataAdapterAction<D1> dataExtractor1,
      DataAdapterAction<D2> dataExtractor2,
      DataAdapterAction<D3> dataExtractor3,
      DataAdapterAction<D4> dataExtractor4,
      DataAdapterAction<D5> dataExtractor5
  ) {
    return new Action4ConvertedFromAction5<>(
        this,
        dataExtractor1,
        dataExtractor2,
        dataExtractor3,
        dataExtractor4,
        dataExtractor5
    );
  }

  @Override
  public Action4<R, D2, D3, D4, D5> convertToAction4(D1 data) {
    return convertToAction4(
        DataAdapters.predefined(data),
        DataAdapters.fixed(0),
        DataAdapters.fixed(1),
        DataAdapters.fixed(2),
        DataAdapters.fixed(3)
    );
  }

  @Override
  public Action6<R, D1, D2, D3, D4, D5, Void> convertToAction6() {
    return new Action6BasedOnAction5<>(this);
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> Action5<_R, _D1, _D2, _D3, _D4, _D5> wrapAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
