package intellispaces.common.action.conditional;

public interface ConditionalActions {

  static <R, D> RequestIfAbsentAction<R, D> requestIfAbsent() {
    return RequestIfAbsentActions.get();
  }


  static <R, D> RequestIfAbsentAction<R, D> requestIfAbsent(Class<R> resultClass, Class<D> dataClass) {
    return RequestIfAbsentActions.get(resultClass, dataClass);
  }
}
