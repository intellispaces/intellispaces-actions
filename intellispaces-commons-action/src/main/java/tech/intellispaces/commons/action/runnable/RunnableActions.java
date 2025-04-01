package tech.intellispaces.commons.action.runnable;

import tech.intellispaces.commons.function.Consumer4;
import tech.intellispaces.commons.function.Consumer5;
import tech.intellispaces.commons.function.Consumer6;
import tech.intellispaces.commons.function.Consumer3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * The provider of runnable actions.
 */
public interface RunnableActions {

  static RunnableAction get(Runnable runnable) {
    return new RunnableBasedRunnableAction(runnable);
  }

  static <D> RunnableAction get(Consumer<D> consumer, D data) {
    return get(() -> consumer.accept(data));
  }

  static <D1, D2> RunnableAction get(BiConsumer<D1, D2> consumer, D1 data1, D2 data2) {
    return get(() -> consumer.accept(data1, data2));
  }

  static <D1, D2, D3> RunnableAction get(Consumer3<D1, D2, D3> consumer, D1 data1, D2 data2, D3 data3) {
    return get(() -> consumer.accept(data1, data2, data3));
  }

  static <D1, D2, D3, D4> RunnableAction get(
      Consumer4<D1, D2, D3, D4> consumer, D1 data1, D2 data2, D3 data3, D4 data4
  ) {
    return get(() -> consumer.accept(data1, data2, data3, data4));
  }

  static <D1, D2, D3, D4, D5> RunnableAction get(
      Consumer5<D1, D2, D3, D4, D5> consumer, D1 data1, D2 data2, D3 data3, D4 data4, D5 data5
  ) {
    return get(() -> consumer.accept(data1, data2, data3, data4, data5));
  }

  static <D1, D2, D3, D4, D5, D6> RunnableAction get(
      Consumer6<D1, D2, D3, D4, D5, D6> consumer, D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6
  ) {
    return get(() -> consumer.accept(data1, data2, data3, data4, data5, data6));
  }
}
