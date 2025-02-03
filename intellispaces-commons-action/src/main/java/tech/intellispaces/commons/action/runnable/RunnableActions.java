package tech.intellispaces.commons.action.runnable;

import tech.intellispaces.commons.base.function.QuadriConsumer;
import tech.intellispaces.commons.base.function.QuintiConsumer;
import tech.intellispaces.commons.base.function.SexiConsumer;
import tech.intellispaces.commons.base.function.TriConsumer;

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

  static <D1, D2, D3> RunnableAction get(TriConsumer<D1, D2, D3> consumer, D1 data1, D2 data2, D3 data3) {
    return get(() -> consumer.accept(data1, data2, data3));
  }

  static <D1, D2, D3, D4> RunnableAction get(
      QuadriConsumer<D1, D2, D3, D4> consumer, D1 data1, D2 data2, D3 data3, D4 data4
  ) {
    return get(() -> consumer.accept(data1, data2, data3, data4));
  }

  static <D1, D2, D3, D4, D5> RunnableAction get(
      QuintiConsumer<D1, D2, D3, D4, D5> consumer, D1 data1, D2 data2, D3 data3, D4 data4, D5 data5
  ) {
    return get(() -> consumer.accept(data1, data2, data3, data4, data5));
  }

  static <D1, D2, D3, D4, D5, D6> RunnableAction get(
      SexiConsumer<D1, D2, D3, D4, D5, D6> consumer, D1 data1, D2 data2, D3 data3, D4 data4, D5 data5, D6 data6
  ) {
    return get(() -> consumer.accept(data1, data2, data3, data4, data5, data6));
  }
}
