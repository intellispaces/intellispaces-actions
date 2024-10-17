package intellispaces.common.action;

import intellispaces.common.action.wrapper.Wrapper;
import intellispaces.common.action.wrapper.Wrapper3;
import intellispaces.common.action.wrapper.Wrapper4;
import intellispaces.common.action.wrapper.Wrapper5;
import intellispaces.common.action.wrapper.Wrapper6;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.type.TypeFunctions;

import java.util.function.Function;

public abstract class AbstractAction3<R, D1, D2, D3> implements Action3<R, D1, D2, D3> {

  @Override
  public int actionOrder() {
    return 3;
  }

  @Override
  public R execute() {
    throw UnexpectedViolationException.withMessage("Action3 expects three input data parameters");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4) {
    return execute(data1, data2, data3);
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return execute(data1, data2, data3);
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5, Void data6) {
    return execute(data1, data2, data3);
  }

  @Override
  @SuppressWarnings("unchecked")
  public R execute(Object[] data) {
    if (data == null || data.length != 3) {
      throw UnexpectedViolationException.withMessage("Action3 expects three input data parameters");
    }
    return execute((D1) data[0], (D2) data[1], (D3) data[2]);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3) {
    return TypeFunctions.convertObjectToInt(execute(data1, data2, data3));
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
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3) {
    return TypeFunctions.convertObjectToDouble(execute(data1, data2, data3));
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
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4) {
    return executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4) {
    return executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, Void data5, Void data6) {
    return executeReturnInt(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, Void data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, Void data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, Void data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, Void data5, Void data6) {
    return executeReturnDouble(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, Void data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, Void data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, Void data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D1 data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action0");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action2");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action3<R, D1, D2, D3> asAction3() {
    return this;
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action5");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5, $D6> Action6<$R, $D1, $D2, $D3, $D4, $D5, $D6> asAction6() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action5");
  }

  @Override
  public <A extends Wrapper> A wrapAction(Function<Action, A> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<R, D1, D2, D3>> W wrapAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<R, D1, D2, D3, Void>> W wrapAction4(
      Function<Action4<R, D1, D2, D3, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<R, D1, D2, D3, Void, Void>> W wrapAction5(
      Function<Action5<R, D1, D2, D3, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper6<R, D1, D2, D3, Void, Void, Void>> W wrapAction6(
      Function<Action6<R, D1, D2, D3, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> W convertAction3(
      Function<Action3<R, D1, D2, D3>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W convertAction4(
      Function<Action4<R, D1, D2, D3, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> W convertAction5(
      Function<Action5<R, D1, D2, D3, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <W extends Wrapper6<_R, _D1, _D2, _D3, _D4, _D5, _D6>, _R, _D1, _D2, _D3, _D4, _D5, _D6> W convertAction6(
      Function<Action6<R, D1, D2, D3, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
