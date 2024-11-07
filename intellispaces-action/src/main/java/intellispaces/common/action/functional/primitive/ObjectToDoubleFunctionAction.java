package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.Action1;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.function.primitive.ObjectToDoubleFunction;

public class ObjectToDoubleFunctionAction<D> extends AbstractAction1<Double, D> implements Action1<Double, D> {
  private final ObjectToDoubleFunction<D> function;

  public ObjectToDoubleFunctionAction(ObjectToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data) {
    return function.apply(data);
  }

  @Override
  public int executeReturnInt(D data) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data) {
    return function.apply(data);
  }
}
