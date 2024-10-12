package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.Action1;
import intellispaces.common.base.function.primitive.ObjectToIntFunction;

public class ObjectToIntFunctionAction<D> extends AbstractAction1<Integer, D> implements Action1<Integer, D> {
  private final ObjectToIntFunction<D> function;

  public ObjectToIntFunctionAction(ObjectToIntFunction<D> function) {
    this.function = function;
  }

  @Override
  public Integer execute(D data) {
    return function.apply(data);
  }

  @Override
  public int executeReturnInt(D data) {
    return function.apply(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return function.apply(data);
  }
}
