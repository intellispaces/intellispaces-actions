package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction1;
import intellispaces.common.action.Action1;
import intellispaces.common.base.function.primitive.ObjectToLongFunction;

public class ObjectToLongFunctionAction<D> extends AbstractAction1<Long, D> implements Action1<Long, D> {
  private final ObjectToLongFunction<D> function;

  public ObjectToLongFunctionAction(ObjectToLongFunction<D> function) {
    this.function = function;
  }

  @Override
  public Long execute(D data) {
    return function.apply(data);
  }

  @Override
  public long executeReturnLong(D data) {
    return function.apply(data);
  }

  @Override
  public double executeReturnDouble(D data) {
    return function.apply(data);
  }
}
