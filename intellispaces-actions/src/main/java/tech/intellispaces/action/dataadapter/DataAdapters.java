package tech.intellispaces.action.dataadapter;

/**
 * The provider of {@link DataAdapterAction action data adapters}.
 */
public interface DataAdapters {

  static <T> DataAdapterAction<T> direct() {
    return new DirectDataAdapterAction<>();
  }

  static <T> DataAdapterAction<T> predefined(T data) {
    return new PredefinedDataAdapterAction<>(data);
  }
}
