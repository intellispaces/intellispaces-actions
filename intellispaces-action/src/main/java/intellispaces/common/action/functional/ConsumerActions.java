package intellispaces.common.action.functional;

import intellispaces.common.action.Action1;
import intellispaces.common.action.Action2;
import intellispaces.common.base.type.Type;
import intellispaces.common.base.type.Types;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface ConsumerActions {

  static <D> Action1<Void, D> of(Consumer<D> consumer) {
    return ofConsumer(consumer, null);
  }

  static <D> Action1<Void, D> of(Consumer<D> consumer, Type<D> dataType) {
    return ofConsumer(consumer, dataType);
  }

  static <D> Action1<Void, D> of(Consumer<D> consumer, Class<D> dataClass) {
    return ofConsumer(consumer, Types.of(dataClass));
  }

  static <D1, D2> Action2<Void, D1, D2> of(BiConsumer<D1, D2> consumer) {
    return ofBiConsumer(consumer, null, null);
  }

  static <D1, D2> Action2<Void, D1, D2> of(
    BiConsumer<D1, D2> consumer, Class<D1> dataClass1, Class<D2> dataClass2
  ) {
    return ofBiConsumer(consumer, Types.of(dataClass1), Types.of(dataClass2));
  }

  static <D1, D2> Action2<Void, D1, D2> of(
    BiConsumer<D1, D2> consumer, Type<D1> dataType1, Type<D2> dataType2
  ) {
    return ofBiConsumer(consumer, dataType1, dataType2);
  }

  static <D> Action1<Void, D> ofConsumer(Consumer<D> consumer, Type<D> dataType) {
    return new ConsumerAction<>(consumer);
  }

  static <D1, D2> Action2<Void, D1, D2> ofBiConsumer(
    BiConsumer<D1, D2> consumer, Type<D1> dataType1, Type<D2> dataType2
  ) {
    return new BiConsumerAction<>(consumer);
  }
}
