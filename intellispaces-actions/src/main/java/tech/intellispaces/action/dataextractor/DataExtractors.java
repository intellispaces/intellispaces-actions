package tech.intellispaces.action.dataextractor;

public interface DataExtractors {

  static <T> DataExtractorAction<T> direct() {
    return new DirectDataExtractorAction<>();
  }

  static <T> DataExtractorAction<T> predefined(T data) {
    return new PredefinedDataExtractorAction<>(data);
  }
}
