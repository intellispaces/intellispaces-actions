package tech.intellispaces.actions.dataadapter;

/**
 * The provider of {@link DataAdapterAction action data adapters}.
 */
public interface DataAdapters {

  static <T> DataAdapterAction<T> oneToOne() {
    return new OneToOneDataAdapterAction<>();
  }

  static <T> DataAdapterAction<T> fixed(int index) {
    return new FixedDataAdapterAction<>(index);
  }

  static <T> DataAdapterAction<T> predefined(T data) {
    return new PredefinedDataAdapterAction<>(data);
  }
}
