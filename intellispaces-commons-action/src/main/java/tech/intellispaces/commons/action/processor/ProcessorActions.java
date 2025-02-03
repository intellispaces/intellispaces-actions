package tech.intellispaces.commons.action.processor;

import tech.intellispaces.commons.action.Action1;
import tech.intellispaces.commons.action.Action2;
import tech.intellispaces.commons.action.Action3;
import tech.intellispaces.commons.action.Action4;
import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.Action6;

import java.util.function.Consumer;

/**
 * Provider of the processor actions.
 */
public interface ProcessorActions {

  static <D> ProcessorAction1<D> get(Consumer<D> consumer) {
    return new ProcessorAction1BasedOnConsumer<>(consumer);
  }

  static <D> ProcessorAction1<D> processorAction1(Action1<Void, D> action1) {
    return new ProcessorAction1BasedOnAction1<>(action1);
  }

  static <D> ProcessorAction1<D> processorAction1(Action2<Void, D, Void> action2) {
    return new ProcessorAction1BasedOnAction2<>(action2);
  }

  static <D> ProcessorAction1<D> processorAction1(Action3<Void, D, Void, Void> action3) {
    return new ProcessorAction1BasedOnAction3<>(action3);
  }

  static <D> ProcessorAction1<D> processorAction1(Action4<Void, D, Void, Void, Void> action4) {
    return new ProcessorAction1BasedOnAction4<>(action4);
  }

  static <D> ProcessorAction1<D> processorAction1(Action5<Void, D, Void, Void, Void, Void> action5) {
    return new ProcessorAction1BasedOnAction5<>(action5);
  }

  static <D> ProcessorAction1<D> processorAction1(Action6<Void, D, Void, Void, Void, Void, Void> action6) {
    return new ProcessorAction1BasedOnAction6<>(action6);
  }

  static <D1, D2> ProcessorAction2<D1, D2> processorAction2(Action2<Void, D1, D2> action2) {
    return new ProcessorAction2BasedOnAction2<>(action2);
  }

  static <D1, D2, D3> ProcessorAction3<D1, D2, D3> processorAction3(Action3<Void, D1, D2, D3> action3) {
    return new ProcessorAction3BasedOnAction3<>(action3);
  }

  static <D1, D2, D3, D4> ProcessorAction4<D1, D2, D3, D4> processorAction4(Action4<Void, D1, D2, D3, D4> action4) {
    return new ProcessorAction4BasedOnAction4<>(action4);
  }

  static <D1, D2, D3, D4, D5> ProcessorAction5<D1, D2, D3, D4, D5> processorAction5(
      Action5<Void, D1, D2, D3, D4, D5> action5
  ) {
    return new ProcessorAction5BasedOnAction5<>(action5);
  }

  static <D1, D2, D3, D4, D5, D6> ProcessorAction6<D1, D2, D3, D4, D5, D6> processorAction6(
      Action6<Void, D1, D2, D3, D4, D5, D6> action6
  ) {
    return new ProcessorAction6BasedOnAction6<>(action6);
  }
}
