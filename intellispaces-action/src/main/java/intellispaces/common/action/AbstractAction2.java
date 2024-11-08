package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction;
import intellispaces.common.action.wrapper.WrapperAction2;
import intellispaces.common.action.wrapper.WrapperAction3;
import intellispaces.common.action.wrapper.WrapperAction4;
import intellispaces.common.action.wrapper.WrapperAction5;
import intellispaces.common.action.wrapper.WrapperAction6;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.object.ObjectFunctions;

import java.util.function.Function;

public abstract class AbstractAction2<R, D1, D2> implements Action2<R, D1, D2> {

  @Override
  public int actionOrder() {
    return 2;
  }

  @Override
  public R execute() {
    throw UnexpectedExceptions.withMessage("Action2 expects two input data parameters");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3) {
    return execute(data1, data2);
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4) {
    return execute(data1, data2);
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, Void data5) {
    return execute(data1, data2);
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, Void data5, Void data6) {
    return execute(data1, data2);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] data) {
    if (data == null || data.length != 2) {
      throw UnexpectedExceptions.withMessage("Action2 expects two input data parameters");
    }
    return execute((D1) data[0], (D2) data[1]);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2) {
    return ObjectFunctions.convertToInt(execute(data1, data2));
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
  public double executeReturnDouble(D1 data1, D2 data2) {
    return ObjectFunctions.convertToDouble(execute(data1, data2));
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
  public int executeReturnInt(D1 data1, D2 data2, Void data3) {
    return executeReturnInt(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3) {
    return executeReturnDouble(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4) {
    return executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, int data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4) {
    return executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, int data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, Void data5) {
    return executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, int data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, int data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, Void data5) {
    return executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, int data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, int data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, Void data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, Void data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, Void data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, Void data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, Void data5, Void data6) {
    return executeReturnInt(data1, data2);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, Void data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, Void data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, Void data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, Void data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, Void data5, Void data6) {
    return executeReturnDouble(data1, data2);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, Void data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, Void data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, Void data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, Void data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "Action2 can not be casted to Action0");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "Action2 can not be casted to Action1");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action2<R, D1, D2> asAction2() {
    return this;
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "Action2 can not be casted to Action3");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "Action2 can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "Action2 can not be casted to Action5");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5, $D6> Action6<$R, $D1, $D2, $D3, $D4, $D5, $D6> asAction6() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "Action2 can not be casted to Action6");
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction2<_R, _D1, _D2>, _R, _D1, _D2> W wrapAction2(
      Function<Action2<R, D1, D2>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> W wrapAction3(
      Function<Action3<R, D1, D2, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W wrapAction4(
      Function<Action4<R, D1, D2, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W wrapAction5(
      Function<Action5<R, D1, D2, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends WrapperAction6<_R, _D1, _D2, _D3, _D4, _D5, _D6>, _R, _D1, _D2, _D3, _D4, _D5, _D6> W wrapAction6(
      Function<Action6<R, D1, D2, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
