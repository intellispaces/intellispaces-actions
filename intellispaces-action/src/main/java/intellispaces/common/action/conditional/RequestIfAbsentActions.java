package intellispaces.common.action.conditional;

public class RequestIfAbsentActions {

  @SuppressWarnings("unchecked")
  public static <R, D> RequestIfAbsentAction<R, D> get() {
    return (RequestIfAbsentAction<R, D>) REQUEST_IF_ABSENT_ACTION;
  }

  @SuppressWarnings("unchecked")
  public static <R, D> RequestIfAbsentAction<R, D> get(Class<R> resultClass, Class<D> dataClass) {
    return (RequestIfAbsentAction<R, D>) REQUEST_IF_ABSENT_ACTION;
  }

  private RequestIfAbsentActions() {}

  private static final RequestIfAbsentAction<?, ?> REQUEST_IF_ABSENT_ACTION = new RequestIfAbsentActionImpl<>();
}
