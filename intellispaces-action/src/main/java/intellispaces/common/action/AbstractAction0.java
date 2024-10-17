package intellispaces.common.action;

import intellispaces.common.action.wrapper.Wrapper;
import intellispaces.common.action.wrapper.Wrapper0;
import intellispaces.common.action.wrapper.Wrapper1;
import intellispaces.common.action.wrapper.Wrapper2;
import intellispaces.common.action.wrapper.Wrapper3;
import intellispaces.common.action.wrapper.Wrapper4;
import intellispaces.common.action.wrapper.Wrapper5;
import intellispaces.common.action.wrapper.Wrapper6;
import intellispaces.common.base.exception.UnexpectedViolationException;
import intellispaces.common.base.type.TypeFunctions;

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
  public R execute(Void data1, Void data2, Void data3, Void data4, Void data5, Void data6) {
    return execute();
  }

  @Override
  public R execute(Object[] data) {
    if (data != null && data.length > 0) {
      throw UnexpectedViolationException.withMessage("Action0 does not expect any input data");
    }
    return execute();
  }

  @Override
  public int executeReturnInt() {
    return TypeFunctions.convertObjectToInt(execute());
  }

  @Override
  public double executeReturnDouble() {
    return TypeFunctions.convertObjectToDouble(execute());
  }

  @Override
  public int executeReturnInt(Void data) {
    return executeReturnInt();
  }

  @Override
  public double executeReturnDouble(Void data) {
    return executeReturnDouble();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2) {
    return executeReturnInt();
  }

  @Override
  public int executeReturnInt(Void data1, int data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, double data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2) {
    return executeReturnDouble();
  }

  @Override
  public double executeReturnDouble(Void data1, int data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, double data2) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3) {
    return executeReturnInt();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, double data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3) {
    return executeReturnDouble();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, double data3) {
    return executeReturnDouble();
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, double data2, double data3) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4) {
    return executeReturnInt();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, double data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4) {
    return executeReturnDouble();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, int data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, double data2, double data3, double data4) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, Void data5) {
    return executeReturnInt();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, double data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, Void data5) {
    return executeReturnDouble();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, int data4, int data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, int data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, double data2, double data3, double data4, double data5) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, Void data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, Void data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, Void data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, Void data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, Void data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public R execute(Void data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, Void data5, Void data6) {
    return executeReturnInt();
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, Void data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, Void data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, Void data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, Void data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, Void data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public int executeReturnInt(Void data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, Void data5, Void data6) {
    return executeReturnDouble();
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, Void data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, Void data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, Void data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, Void data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, Void data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, int data4, int data5, int data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, int data4, int data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, int data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, int data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, int data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(Void data1, double data2, double data3, double data4, double data5, double data6) {
    throw UnexpectedViolationException.withMessage("Unsupported operation");
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
  public <$R, $D1, $D2, $D3, $D4, $D5, $D6> Action6<$R, $D1, $D2, $D3, $D4, $D5, $D6> asAction6() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action0 can not be casted to Action6");
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
  public <W extends Wrapper6<R, Void, Void, Void, Void, Void, Void>> W wrapAction6(
      Function<Action6<R, Void, Void, Void, Void, Void, Void>, W> wrapperFactory
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

  @Override
  public <W extends Wrapper6<_R, _D1, _D2, _D3, _D4, _D5, _D6>, _R, _D1, _D2, _D3, _D4, _D5, _D6> W convertAction6(
      Function<Action6<R, Void, Void, Void, Void, Void, Void>, W> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}
